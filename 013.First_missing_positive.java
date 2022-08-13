package com.saptak;

import java.util.HashSet;

//problem link: https://leetcode.com/problems/first-missing-positive/

public class First_missing_positive {
    public static int helper(int[] nums)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums)
        {
            set.add(num); //(-1,1,3,4)
        }
        int j = 0;
        int k = 1;
        for(int i=1;k>0;i++)
        {
            if(set.contains(i))
            {
                continue;
            }
            else
            {
                j = i;
                k--;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        int ans = helper(nums);
        System.out.println(ans);
    }

}
