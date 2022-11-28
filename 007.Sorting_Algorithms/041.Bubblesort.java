package com.saptak;

import java.util.Arrays;

public class Bubblesort {
    public static int[] helper(int[] nums)
    {
        int n = nums.length;
        int temp = 0;
        for(int i=0;i<n;i++)
        {
            for(int j= 1;j<n-i;j++)
            {
                if(nums[j-1] > nums[j])
                {
                    //swap the elements
                    temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,1,5};
        int[] res = helper(nums);
        System.out.println(Arrays.toString(res));
    }
}
