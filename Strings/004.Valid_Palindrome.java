package com.saptak;

//problem link: https://leetcode.com/problems/valid-palindrome/

public class Valid_Palindrome {
    public static boolean helper(String s)
    {
        //base case
        if(s.equals(' ')) return true;
        //convert everything to lowercase
        s = s.toLowerCase();
        //now, remove the spaces from the string
        s = s.replaceAll("[^a-z0-9]", "");
        //now use 2 pointer approach

        for(int i=0,j=s.length()-1;i<j;i++,j--)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean ans = helper(s);
        System.out.println(ans);
    }
}
