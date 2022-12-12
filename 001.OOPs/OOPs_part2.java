package com.saptak.OOPs;

//This file contains concepts of packages,Singleton Class and Static keyword

public class OOPs_part2 {
    /*packages are containers for classes

      static variables are the variables whose properties are not directly
      related to objects

      non-static members can't be inside static members.
      To do that, create an object of the class and use it with the non-static member

      static members can be inside non-static members.
      */
    public static class Human {
        int age;
        String name;
        boolean married;
        /*population is static as it's not dependent on any object
        It's value will remain same for any object  I
        */
        static long population;

        public Human(int age, String name,boolean married) {
            this.age = age;
            this.name = name;
            this.married = married;
            //To access static variables, use the class name
            Human.population += 1;
        }


    }

    //Initialisation of static variables
    //Note: StaticBlock, Human are innerclasses inside the outerclass OOPs_part2
    //Only inner classes can be static, not outside classes
    //static variables and methods are resolved during compiled time
    public static class StaticBlock {
        static int a = 2;
        static int b;

        //this will only run once when the first object is created, when the class is loaded for the 1st time
        static {
            System.out.println("Iam in static block");
            b = a * 10;
        }

    }

    //Singleton class  : Only one object can be created
    public static class Singleton {
        private Singleton () {

        }
        private static Singleton instance;

        public static Singleton getInstance() {
            //check whether 1 obj only is created or not
            if(instance == null) {
                instance = new Singleton();
            }

            return instance;
        }
    }

    public static void main(String[] args) {

        Human saptak = new Human(22,"Saptak",false);
        Human sayan = new Human(22,"Sayan",false);
        System.out.println(saptak.population);
        System.out.println(sayan.population);

        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }

}
