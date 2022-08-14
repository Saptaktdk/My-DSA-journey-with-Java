package com.saptak;

//problem link: https://leetcode.com/problems/subarray-sum-equals-k/

import java.util.HashMap;

public class Subarray_sum_equals_k {
    public static int helper(int[] nums, int k)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1); //this is necessary

        int sum = 0, result = 0;
        for(int num: nums)
        {
            sum += num;
            if(map.containsKey(sum-k))
            {
                result += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return result;

    }

    public static void main(String[] args) {
        int[] nums ={1,2,3};
        int k =3;
        int ans = helper(nums,k);
        System.out.println(ans);
    }

}
