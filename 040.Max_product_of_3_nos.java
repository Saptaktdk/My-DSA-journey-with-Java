package com.saptak;

//problem link: https://leetcode.com/problems/maximum-product-of-three-numbers/

import java.util.Arrays;

public class Max_product_of_3_nos {
    public static int helper(int[] nums)
    {
        Arrays.sort(nums);

        int n = nums.length;
        return Math.max(nums[0]*nums[1]*nums[2],nums[n-1]*nums[n-2]*nums[n-3]);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int ans = helper(nums);
        System.out.println(ans);
    }
}
