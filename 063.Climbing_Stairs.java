package com.saptak;

//problem link: https://leetcode.com/problems/climbing-stairs/

public class Climbing_Stairs {
    public static int helper(int n)
    {
        //Dynamic programming approach
        if(n == 1) return 1;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;

        for(int i=3;i<=n;i++)
        {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];

    }

    public static void main(String[] args) {
        int n = 3;
        int ans = helper(n);
        System.out.println(ans);
    }
}
