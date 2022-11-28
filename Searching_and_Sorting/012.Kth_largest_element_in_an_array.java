package com.saptak;

//problem link: https://leetcode.com/problems/kth-largest-element-in-an-array/

import java.util.Arrays;

public class kth_largest_element_in_an_array {
    public static int helper(int[] nums, int k)
    {
        Arrays.sort(nums);
        int[] res = new int[nums.length];
        int j= 0;
        for(int i=nums.length-1;i>=0;i--)
        {
            res[j++] = nums[i];
        }
        return res[k-1];
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int ans = helper(nums,k);
        System.out.println(ans);
    }
}
