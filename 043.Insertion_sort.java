package com.saptak;

import java.util.Arrays;

public class Insertion_sort {
    public static int[] helper(int[] nums)
    {
        int n= nums.length;
        for(int i=1;i<n;i++)
        {
            int key = nums[i];
            int j = i-1;
            while(j>=0 && nums[j] > key)
            {
                //do the swap
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
                j--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,5,2,4};
        int[] res = helper(nums);
        System.out.println(Arrays.toString(res));

    }
}
