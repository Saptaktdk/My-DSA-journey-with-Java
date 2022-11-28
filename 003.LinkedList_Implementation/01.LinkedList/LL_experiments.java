package com.saptak.LinkedList;

public class LL_experiments {
    public static void main(String[] args) {
        LL list = new LL(5);

        list.insertFirst(6);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);

        list.displayLL();
        System.out.println("\n" + list.deleteFirst() + " is deleted");
        list.displayLL();
        System.out.println("\n" + list.deleteLast() + " is deleted");
        list.displayLL();
        list.insert(100,1);
        System.out.println("\n");
        list.displayLL();




    }
}
