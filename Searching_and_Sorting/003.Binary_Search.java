package com.saptak;

//problem link: https://leetcode.com/problems/binary-search/

public class Binary_Search {
    public static int B_Search(int[] nums,int target)
    {
        int start =0;
        int end = nums.length-1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                end = mid -1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int res = B_Search(nums, target);
        System.out.println(res);
    }
}
