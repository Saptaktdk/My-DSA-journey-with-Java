package com.saptak;

public class Check_if_a_linked_list_is_a_palindrome {

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

    //function to reverse the linked list
    public static Node reverseList(Node head)
    {
        Node curr = head;
        Node prev = null;
        Node next = null;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr; //prev now points to the value that curr points
            curr = next; //curr now points to the value that next points

        }
        //prev will move at the end of the list,i.e it will be starting node
        //of the reverse linked list ,so assign head to the value prev points
        head = prev;

        return head;

    }

    //function to check if the linked list is a palindrome or not
    public static boolean isPalindrome(Node one, Node two)
    {
        while(one != null && two != null)
        {
            if(one.val != two.val)
            {
                return false;
            }
            one = one.next;
            two = two.next;
        }
        return true;

    }

    public static void main(String[] args) {
        Node start = new Node(4);
        start.next = new Node(5);
        start.next.next = new Node(5);
        start.next.next.next = new Node(6);

        boolean ans = isPalindrome(start,reverseList(start));
        System.out.print(ans);
    }
}
