package com.saptak;

import java.util.Arrays;

//problem link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class First_and_last_position {
    public static int find_first(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length-1;
        int pos = -1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(nums[mid] < target)
            {
                start = mid + 1;
            }
            else if(nums[mid] > target)
            {
                end = mid -1;
            }
            else
            {
                pos = mid;
                end = mid -1;
            }
        }
        return pos;
    }
    public static int find_last(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length-1;
        int pos = -1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(nums[mid] < target)
            {
                start = mid + 1;
            }
            else if(nums[mid] > target)
            {
                end = mid -1;
            }
            else
            {
                pos = mid;
                start = mid + 1;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] res = new int[2];
        res[0] = find_first(nums,target);
        res[1] = find_last(nums,target);
        System.out.println(Arrays.toString(res));
    }




}
