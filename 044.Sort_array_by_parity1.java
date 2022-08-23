package com.saptak;

//problem link: https://leetcode.com/problems/sort-array-by-parity/

import java.util.Arrays;

public class Sort_array_by_parity1 {
    public static  int[] helper(int[] nums)
    {
        //two pointer approach using post increment operations
        int n = nums.length;
        int[] res = new int[n];
        int j=0, k= n-1;

        for(int i=0;i<n;i++)
        {
            if(nums[i]%2 == 0)
            {
                res[j++] = nums[i];
            }
            else
            {
                res[k--] = nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        int[] ans = helper(nums);
        System.out.println(Arrays.toString(ans));

    }

}
