package com.saptak;

/*problem link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

Description: Given an integer array nums sorted in non-decreasing order, remove the duplicates inplace such that each unique element appears only once.
The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums.
More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. 
It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).*/

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
