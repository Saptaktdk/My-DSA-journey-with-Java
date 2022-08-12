package com.saptak;

public class Richest_customer_wealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        int ans = helper(accounts);
        System.out.println(ans);

    }

    public static int helper(int[][] accounts) {
        int maxi = -999999999;
        for(int i=0;i< accounts.length;i++)
        {
            int sum = 0;
            for(int j=0;j< accounts[0].length;j++)
            {
                sum += accounts[i][j];
            }
            maxi = Math.max(sum,maxi);

        }
        return maxi;

    }
}
