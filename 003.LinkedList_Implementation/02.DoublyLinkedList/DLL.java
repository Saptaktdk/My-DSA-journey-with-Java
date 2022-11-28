package com.saptak.DoublyLinkedList;

public class DLL {

    private Node head;

    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null)
        {
            head.prev = node;
        }
        head = node;
    }

    public void displayDLL()
    {
        Node temp = head;
        Node last = null; //we are keeping track of the last node that points to null
        while(temp != null)
        {
            System.out.printf(temp.val + "->"); //displaying the linked list
            last = temp;
            temp = temp.next;
        }
        System.out.println("NULL");

        System.out.println("Printing in reverse");
        while(last != null)
        {
            System.out.printf(last.val + "->"); //displaying the linked list in reverse
            last = last.prev;
        }
        System.out.println("NULL");


    }

    public void insertLast(int val)
    {
        Node node = new Node(val);
        if(head == null)
        {
            node.prev = null;
            head = node;
            return;
        }
        Node temp = head;
        Node last = null;
        while(temp != null)
        {
            last = temp;
            temp = temp.next;
        }
        node.next = null;
        last.next = node;
        node.prev = last;


    }

    public Node find(int val)
    {
        Node node = head;
        while(node != null)
        {
            if(node.val == val)
            {
                return node;
            }
            node = node.next;
        }
        return null;

    }

    public void insert(int val, int after)
    {
        Node p = find(after);

        if(p == null)
        {
            System.out.println("Doesn't exist");

        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null)
        {
            node.next.prev = node;
        }

    }

    private class Node
    {

        private int val;
        private Node next;
        private Node prev;

        //Constructors
        public Node(int val)
        {
            this.val = val;
        }

        public Node(int val, Node next, Node prev)
        {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }
}
