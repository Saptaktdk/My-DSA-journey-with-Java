package com.saptak;

//problem link: https://leetcode.com/problems/contains-duplicate/

import java.util.HashMap;

public class Contains_duplicate {
    public static boolean helper(int[] nums)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums)
        {
            if(!map.containsKey(num))
            {
                map.put(num, 1);

            }
            else
            {
                map.put(num, map.get(num)+1);
                if(map.get(num) > 1)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        boolean ans = helper(nums);
        System.out.println(ans);
    }
}
