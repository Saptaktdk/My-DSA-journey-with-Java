package com.saptak;

//write a program to return the kth to last element of a singly linked list

public class Return_elements_from_a_given_index_to_last_in_a_linked_list {

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

    //function for returning the desired nodes
    public static void helper(Node head, int index)
    {
        Node curr = head;
        for(int i=1;i<index;i++)
        {
            curr = curr.next;
        }
        while(curr != null)
        {
            System.out.printf(curr.val + "->");
            curr = curr.next;
        }
        System.out.println("NULL");

    }

    public static void main(String[] args) {
        Node start = new Node(4);
        start.next = new Node(6);
        start.next.next = new Node(7);
        start.next.next.next = new Node(8);
        start.next.next.next.next = new Node(10);

        helper(start,3);
    }

}
