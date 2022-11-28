package com.saptak;

//problem link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

import java.util.Arrays;

public class Numbers_smaller_than {

    public static int[] helper(int[] nums)
    {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int count = 0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i] > nums[j])
                {
                    count ++;
                }

            }
            ans[i] = count;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] res = helper(nums);
        System.out.println(Arrays.toString(res));
    }
}
