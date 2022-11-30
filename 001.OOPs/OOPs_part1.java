package com.saptak.OOPs;

//This file contains the concepts of classes, objects, constructors and keywords

public class OOPs_part1 {
    public static void main(String[] args) {
        //create an object for the class student
        Student s1;
        //create object dynamically
        Student s2 = new Student();

        //first declare
        Student s3;
        //then initialize it
        s3 = new Student();

        //By default, the values of  instance variables will be null
        System.out.println(s3.marks);
        System.out.println(s3.roll_no);
        System.out.println(s3.name);

        //assigning values to the instance variables
        s2.name = "Saptak";
        s2.marks = 89f;
        s2.roll_no = 21;

        //Constructors: to allocate values to the instance variables
        //It's a special function that runs when you create an object, and it allocates variables

        //This is default constructor calling
        s1 = new Student();

        //parameterized constructor calling
        Student s4 = new Student(23,"Ram",67.9f);

        //Using constructor overloading
        Student random = new Student(s2);
        System.out.println(random.name); //It will give the output as Saptak

        //final keyword
        //Final is used to apply restrictions on class, method, and variable.
        //It makes them impossible to inherit or override
        final int num = 2;
        //num = 3; it will give error

        final A saptak = new A("Saptak Das");
        saptak.name = "something"; //it is feasible

        //when a non primitive is final, you can't reassign it.
        //saptak = new A("new object"); It can't be done



    }

    //create a class
    static class Student
    {
        int roll_no;
        String  name;
        float marks;

        //by default constructor
        Student()
        {
            //calling a constructor from another constructor
            this (0,null,0.0f);

        }

        //parameterized constructor
        Student(int roll_no,String name,float marks)
        {
            this.roll_no = roll_no;
            this.name = name;
            this.marks = marks;

        }

        //In the above, the constructor can be either by default or parameterized
        //This is called function overloading
        //It means using the function in multiple ways.
        //The below constructor is also a use case of constructor overloading

        Student(Student other)
        {
            this.name = other.name;
            this.marks = other.marks;
            this.roll_no = other.roll_no;
        }

    }

    static class A
    {
        final int num = 8;
        String name;

        //constructor
        public A(String name)
        {
            System.out.println("Object created");
            this.name = name;
        }

        //whenever any object of this class is freed from the memory,this function will be called
        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("Object is destroyed");
        }
    }

}






















