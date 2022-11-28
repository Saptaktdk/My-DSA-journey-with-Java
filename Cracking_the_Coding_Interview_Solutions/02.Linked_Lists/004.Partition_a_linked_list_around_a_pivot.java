package com.saptak;

//Write a code to partition a linked list around a value x such that all the nodes less than
//x come before all the nodes greater than or equal to x. If x contained within the list, the
//values of x only need to be after the elements less than x.

public class Partition_a_linked_list_around_a_pivot {
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

    public static void partition(Node head,int x)
    {

        //declare 4 pointers for the two lists to contain elements < x and >= x  respectively

        //For the list that will contain values less than x
        Node beforeHead = null;
        Node beforeTail = null;

        //For the list that will contain values greater than or equal to x
        Node afterHead = null;
        Node afterTail = null;

        while(head != null)
        {
            Node next = head.next;
            head.next = null; //cut the connection from the other nodes



            if(head.val < x)
            {
                if(beforeHead == null)
                {
                    beforeHead = head;
                    beforeTail = beforeHead;
                }
                else
                {
                    beforeTail.next = head;
                    beforeTail = head;
                }
            }
            else
            {
                if(afterHead == null)
                {
                    afterHead = head;
                    afterTail = afterHead;
                }
                else
                {
                    afterTail.next = head;
                    afterTail = head;
                }
            }
            head = next;

        }

        if(beforeHead == null)
        {
            //display the LL from afterhead
            while(afterHead != null)
            {
                System.out.printf(afterHead.val + "->");
                afterHead = afterHead.next;
            }
            System.out.println("NULL");
        }
        //Merge the two linked lists

        beforeTail.next = afterHead;

        //display the linked list
        while(beforeHead != null)
        {
            System.out.printf(beforeHead.val + "->");
            beforeHead = beforeHead.next;

        }
        System.out.println("NULL");



    }

    public static void main(String[] args) {
        Node start = new Node(6);
        start.next = new Node(5);
        start.next.next = new Node(6);
        start.next.next.next = new Node(4);

        partition(start,5);

    }
}
