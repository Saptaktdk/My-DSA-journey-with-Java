package com.saptak;

//problem link: https://leetcode.com/problems/find-the-duplicate-number/submissions/

import java.util.HashSet;

public class Find_duplicate_number {
    public static int helper(int[] nums)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums)
        {
            if(set.contains(num))
            {
                return num;
            }
            set.add(num);
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,4,6};
        int ans = helper(nums);
        System.out.println(ans);
    }
}
