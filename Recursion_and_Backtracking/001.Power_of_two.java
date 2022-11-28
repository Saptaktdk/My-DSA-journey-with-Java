package com.saptak;

//problem link: https://leetcode.com/problems/power-of-two/

public class Power_of_two {
    public static boolean helper(int n)
    {
        //base case:
        if(n==1) return true;
        int i=1;
        while(i<n)
        {
            i *= 2;
        }
        return (i==n);
    }

    public static void main(String[] args) {
        int n = 3;
        boolean ans = helper(n);
        System.out.print(ans);
    }
}
