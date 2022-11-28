package com.saptak;

//in this problem , head of the linked list can't be deleted

public class Delete_node_of_the_linked_list {
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


    public static int getsize(Node head)
    {
        Node temp = head;
        int size = 0;
        while(temp != null)
        {
            size++;
            temp = temp.next;
        }
        return size;

    }

    public static void deleteNode(Node head, int index)
    {
        Node prev = head;

        //loop to the element before the element in the given index
        for(int i=0;i<index-1;i++)
        {
                prev = prev.next;
        }
        //now delete the element next to prev
        prev.next = prev.next.next;


    }

    public static void display(Node head)
    {
        Node curr = head;
        while(curr != null)
        {
            System.out.printf(curr.val + "->");
            curr = curr.next;
        }
        System.out.println("NULL");

    }

    public static void main(String[] args) {
        Node start = new Node(6);
        start.next = new Node(4);
        start.next.next = new Node(8);
        start.next.next.next = new Node(10);
        start.next.next.next.next = new Node(12);

        display(start);
        deleteNode(start,0);
        display(start);

    }

}
