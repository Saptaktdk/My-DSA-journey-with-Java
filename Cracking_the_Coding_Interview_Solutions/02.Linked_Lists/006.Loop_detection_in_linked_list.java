package com.saptak;

//Given a circular linked list, write a program that returns the node at the beginning of the loop


import java.util.Collections;

public class Loop_detection_in_linked_list {
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

    //function to implement loop detection
    public static boolean loopDetection(Node head) {

        if(head == null)
        {
            return false;
        }
        //Initialize 2 pointers
        Node slow = head;
        Node fast = head.next;

        while (slow != fast) {
            //corner cases
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.printf("Intersection point is " + slow.val);
        System.out.println();
        return true;

    }

    public static void main(String[] args) {
        Node start = new Node(1);
        start.next = new Node(2);
        start.next.next = new Node(3);
        start.next.next.next = new Node(4);
        start.next.next.next.next = new Node(5);
        start.next.next.next.next.next = start.next.next;

        boolean ans = loopDetection(start);
        System.out.print(ans);

    }
}
