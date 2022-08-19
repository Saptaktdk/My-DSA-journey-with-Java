package com.saptak;

public class Search_in_Rotated_Array_II {
    public static boolean helper(int[]nums,int target)
    {
        for(int num: nums)
        {
            if(num == target)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        int target = 0;
        boolean ans = helper(nums, target);
        System.out.println(ans);
    }
}
