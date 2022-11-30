package com.saptak;

//problem link: https://leetcode.com/problems/search-in-rotated-sorted-array/

public class Search_in_Rotated_Array {
    public static  int helper(int[]nums, int target)
    {
        int left = 0;
        int right = nums.length-1;
        //doing a modified binary search to find the smallest element
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
        //now left = smallest element
        int start = left;
        left = 0;
        right = nums.length-1;

        //logic to decide whether to search on  left or right of the pivot
        if(target >= nums[start] && target <= nums[right])
        {
            left = start;
        }
        else
        {
            right = start;

        }
        //Normal Binary Search to find the target

        while (left <= right)
        {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if (nums[mid] < target )
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = helper(nums, target);
        System.out.println(ans);
    }
}
