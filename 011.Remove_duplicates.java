package com.saptak;

//problem link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class Remove_duplicates {
    public static int helper(int[]nums)
    {
        int i=0;
        //j will keep track of current element and i will keep track of unique elements
        for(int j=0;j<nums.length;j++)
        {
            if(nums[i] != nums[j])
            {
                //bypass the duplicate and move to next unique element
                nums[++i] = nums[j];

            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int res = helper(nums);
        System.out.println(res);
    }

}
