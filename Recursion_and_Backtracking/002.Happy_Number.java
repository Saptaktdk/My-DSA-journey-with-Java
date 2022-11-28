package com.saptak;

//problem link: https://leetcode.com/problems/happy-number/

public class Happy_Number {
    public static boolean helper(int n)
    {
        if(n == 1 ) return true;
        if(n < 9) return false;

        int sum = 0;
        int x = 0;

        while(n > 0)
        {
            x = n % 10;
            sum += x * x;
            n /= 10;

        }
        return helper(sum);

    }

    public static void main(String[] args) {
        int n = 19;
        boolean ans = helper(n);
        System.out.print(ans);
    }

}
