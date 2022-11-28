package com.saptak;

import java.util.Arrays;

public class Selection_sort {
    public static int[] helper(int[] nums)
    {
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            int small = i;
            for(int j= i+1;j<n;j++)
            {
                if(nums[j] < nums[small])
                {
                    small = j;

                    //now swap the values
                    int temp = nums[i];
                    nums[i] = nums[small];
                    nums[small] = temp;
                }
            }

        }
        return  nums;



    }

    public static void main(String[] args) {
        int[] nums = {3,4,2,5,1};
        int[] res = helper(nums);
        System.out.println(Arrays.toString(res));
    }
}
