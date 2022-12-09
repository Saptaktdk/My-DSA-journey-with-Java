package com.saptak;

/*problem link: https://leetcode.com/problems/number-of-good-pairs/

Description: Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.*/

public class Number_of_good_pairs {
    public static int pairs(int[] nums)
    {
        int count = 0;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i] == nums[j])
                {
                    count++;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};

        int ans = pairs(nums);
        System.out.println(ans);
    }
}
