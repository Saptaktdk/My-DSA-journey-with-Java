package com.saptak;
/*Problem link: https://leetcode.com/problems/running-sum-of-1d-array/

Description: Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]). Return the running sum

Input examples:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as folows: [1, 1+2, 1+2+3, 1+2+3+4].
Return the running sum of nums. */

public class RunSum {

    public static int[] runningsum(int[] arr)
    {
        int[] res = new int[arr.length];
        if(arr.length == 0) return res;
        res[0] =arr[0];
        for(int i=1;i<arr.length;i++)
        {
            res[i] = res[i-1] + arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] res = runningsum(arr);
        System.out.print("[");
        for(int i=0;i<res.length-1;i++)
        {
            System.out.print(res[i] + ",");
        }
        System.out.print(res[res.length-1] + "]");

    }

}
