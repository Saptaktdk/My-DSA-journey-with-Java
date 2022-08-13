package com.saptak;

import java.util.Arrays;

public class Shuffle_The_Array {
    //problem link: https://leetcode.com/problems/shuffle-the-array/
    public static int[] shuffle(int[] nums, int n)
    {
        int[] ans = new int[2*n];
        int j=0;
        for(int i=0;i<2*n;i+=2)
        {
            ans[i] = nums[j];
            ans[i+1] = nums[j+n];
            j++;
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] res = shuffle(nums, n);
        System.out.println(Arrays.toString(res));

    }
}
