package com.saptak;

import java.util.HashMap;

//problem link: https://leetcode.com/problems/single-element-in-a-sorted-array/

public class Single_Element_method1 {
    public static int helper(int[] nums)
    {
        HashMap<Integer, Integer> map =  new HashMap<>();
        for(int num: nums)
        {
            if(map.containsKey(num))
            {
                map.put(num, map.get(num)+1);
            }
            else
            {
                map.put(num,1);
            }
        }
        for(int num: nums)
        {
            if(map.get(num) == 1)
            {
                return num;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8,};
        int ans = helper(nums);
        System.out.println(ans);
    }
}
