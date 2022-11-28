package com.saptak;

//problem link: https://leetcode.com/problems/majority-element/

import java.util.HashMap;

public class Majority_element {
    public static int helper(int[] nums)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums)
        {
            if(!map.containsKey(num))
            {
                map.put(num,1);
            }
            else
            {
                map.put(num, map.get(num)+1);
                if(map.get(num) > nums.length/2)
                {
                    return num;
                }
            }
        }
        return nums[0];
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int ans = helper(nums);
        System.out.println(ans);
    }
}
