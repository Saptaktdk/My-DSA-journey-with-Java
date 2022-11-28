package com.saptak;

//problem link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

public class Minimum_in_rotated_sorted_array {
    public static int helper(int[] nums)
    {
        int left = 0;
        int right = nums.length-1;
        //doing a modified binary search to find the minimum element
        while(left < right)
        {
            int mid = left + (right - left)/2;
            if(nums[mid] > nums[right])
            {
                left = mid + 1;
            }
            else
            {
                right = mid;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        int ans = helper(nums);
        System.out.println(ans);
    }
}
