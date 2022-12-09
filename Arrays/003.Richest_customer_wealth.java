package com.saptak;

/*problem link: https://leetcode.com/problems/richest-customer-wealth/

Description: You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank.
Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts.
The richest customer is the customer that has the maximum wealth.

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation: 
1st customer has wealth = 6
2nd customer has wealth = 10 
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.*/

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
