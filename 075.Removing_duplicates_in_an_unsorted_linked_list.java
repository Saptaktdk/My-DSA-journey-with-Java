package com.saptak;

import java.util.HashSet;
import java.util.LinkedList;

public class Removing_duplicates_in_an_unsorted_linked_list {
    static class Node
    {
        int val;
        Node next;

        //constructor
        public Node(int val)
        {
            this.val = val;
        }
    }


    //function to remove duplicates from the unsorted linked list
    public static void removeDuplicates(Node head)
    {
        //using hashset to store seen values
        HashSet<Integer> set = new HashSet<>();

        //iterate through every element
        Node curr = head;
        Node prev = null;
        while(curr != null)
        {
            //if the set contains the curr value, then skip it
            if(set.contains(curr.val))
            {
                prev.next = curr.next;
            }
            else
            {
                set.add(curr.val);
                prev = curr;
            }
            curr = curr.next;

        }

    }

    //function to print the linkedlist
    public static void display(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.printf(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("NULL");

    }



    public static void main(String[] args) {
        Node head =  new Node(4);
        head.next = new Node(6);
        head.next.next = new Node(6);
        head.next.next.next = new Node(8);

        display(head);
        removeDuplicates(head);
        display(head);


    }

}
