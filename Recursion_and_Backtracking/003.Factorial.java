package com.saptak;

public class Factorial {
    public static  long helper(int n)
    {
        if(n == 0) return 1;
      
        return n * helper(n-1);

    }

    public static void main(String[] args) {
        int n = 5;
        long res = helper(n);
        System.out.print(res);
    }
}
