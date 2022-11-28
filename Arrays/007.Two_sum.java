package com.saptak;

//problem link: https://leetcode.com/problems/two-sum/

import java.util.Arrays;

public class Two_sum {
    public static int[] twoSum(int[] nums, int target)
    {
        int[] ans = new int[2];
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }
}
