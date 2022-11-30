package com.saptak;

//problem link: https://leetcode.com/problems/missing-number/

public class Missing_number {
    public static int helper(int[] nums)
    {
        int sum = 0;
        for(int i=0;i<=nums.length;i++)
        {
            sum += i;
        }
        for(int j=0;j<nums.length;j++)
        {
            sum -= nums[j];
        }
        return  sum;

    }

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int ans = helper(nums);
        System.out.println(ans);
    }
}
