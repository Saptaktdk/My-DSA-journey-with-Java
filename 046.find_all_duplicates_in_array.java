package com.saptak;

//problem link: https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.HashMap;

public class find_all_duplicates_in_array {
    public static ArrayList<Integer> helper(int[] nums)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: nums)
        {
            if(!map.containsKey(num))
            {
                map.put(num,1);
            }
            else
            {
                map.put(num,map.get(num)+1);
                if(map.get(num) > 1)
                {
                    list.add(num);

                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> res = helper(nums);
        System.out.println(res);
    }
}
