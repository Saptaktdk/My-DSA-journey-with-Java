package com.saptak;

//problem link: https://leetcode.com/problems/sort-colors/

import java.util.Arrays;

public class Sort_Colors {
    public static int[] sort(int[] nums)
    {
        int start = 0, end = nums.length - 1;
        int index =0; //index will move forward and will tell if the element is 0 or 1 or 2
        while(index <= end && start < end)
        {
            if(nums[index] == 0)
            {
                nums[index] = nums[start];
                nums[start] = 0;
                start++;
                index++;

            }
            else if (nums[index] == 2)
            {
                nums[index] = nums[end];
                nums[end] = 2;
                end --; //index++ is not a good idea as we swap the 2's from the back
            }
            else
            {
                index++;
            }
        }
        return nums;

    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        int[] res = sort(nums);
        System.out.println(Arrays.toString(res));
    }
}
