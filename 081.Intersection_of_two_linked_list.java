package com.saptak;

//Given two singly linked lists, determine if the two lists intersect.
//Return the intersecting node.
//Note that the intersection is defined based on reference, not value.

public class Intersection_of_two_linked_list {
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

    //function to find the intersection point
    public static boolean intersection(Node one, Node two)
    {
        //corner cases
        if(one == null || two == null)
        {
            return false;
        }

        //two pointer method
        Node a_pointer = one;
        Node b_pointer = two;

        while(a_pointer != b_pointer)
        {
            //The a_pointer and b_pointer will only become null when they reach end of the list
            if(a_pointer == null)
            {
                a_pointer = two;
            }
            else
            {
                a_pointer = a_pointer.next;
            }

            if(b_pointer == null)
            {
                b_pointer = one;
            }
            else
            {
                b_pointer = b_pointer.next;
            }
        }
        //loop will break, when there is an intersection point
        System.out.println("The intersection point is at value " + b_pointer.val);
        System.out.println();
        return true;
    }

    public static void main(String[] args) {
        Node one = new Node(1);
        one.next = new Node(3);
        one.next.next = new Node(5);
        one.next.next.next = new Node(6);

        Node two = new Node(2);
        two.next =  one.next.next;
        two.next.next =  one.next.next.next;

        boolean ans = intersection(one,two);
        System.out.print(ans);
    }

}
