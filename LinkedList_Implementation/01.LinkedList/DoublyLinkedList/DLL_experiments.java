package com.saptak.DoublyLinkedList;

public class DLL_experiments {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(2);

        //list.displayDLL();
        list.insertLast(19);
        //list.displayDLL();

        list.insert(23,9);
        list.displayDLL();




    }




}
