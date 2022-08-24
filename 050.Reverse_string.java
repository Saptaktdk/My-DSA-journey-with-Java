package com.saptak;

//problem link: https://leetcode.com/problems/reverse-string/

public class Reverse_string {
    public static  char[] helper(char[] s)
    {
        //two pointer approach
        for(int i=0,j=s.length-1;i<j;i++,j--)
        {
            //swap ith and jth elements
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
        return s;
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        char[] ans = helper(s);
        System.out.print(ans);
    }
}
