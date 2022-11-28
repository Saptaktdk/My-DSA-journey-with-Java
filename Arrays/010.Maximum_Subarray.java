package com.saptak;

//problem link: https://leetcode.com/problems/maximum-subarray/

public class Maximum_Subarray {
    public static int max_subarray(int[] nums)
    {
        //Kadanes Algorithm
        int curr_sum = 0, max_sum = nums[0];
        for (int i=0;i<nums.length;i++)
        {
            curr_sum += nums[i];

            if(curr_sum > max_sum)
            {
                max_sum = curr_sum;
            }
            if(curr_sum < 0)
            {
                curr_sum = 0;
            }
        }
        return  max_sum;

    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = max_subarray(nums);

        System.out.println(ans);

    }

}
