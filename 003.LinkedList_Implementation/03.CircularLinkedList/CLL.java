package com.saptak.CircularLinkedList;

public class CLL {

    private Node head;
    private Node tail;

    //constructor
    public CLL()
    {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int val)
    {
        Node node = new Node(val);
        if(head == null)
        {
            head = node;
            tail = node;

        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void displayCLL()
    {
        Node node =  head;
        if(head != null)
        {
            do
            {
                System.out.printf(node.val + "->");
                node = node.next;
            }
            while(node != head);
        }
        System.out.println("Back to head");
    }
    private class Node
    {
        private int val;
        private Node next;

        //constructor
        public Node(int val)
        {
            this.val = val;
        }
    }
}
