package com.saptak;

//problem link: https://leetcode.com/problems/number-of-good-pairs/

public class Number_of_good_pairs {
    public static int pairs(int[] nums)
    {
        int count = 0;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i] == nums[j])
                {
                    count++;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};

        int ans = pairs(nums);
        System.out.println(ans);
    }
}
