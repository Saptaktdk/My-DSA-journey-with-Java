package com.saptak;

/*Problem link: https://leetcode.com/problems/concatenation-of-array/

Description: Given an integer array nums of length n, 
you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.

Return the array ans.

Input example:
Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]*/

import java.util.Arrays;

public class Concatenate {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {5,6,7,8,9};
        int n = nums1.length + nums2.length;
        int[] ans = new int[n];
        int pos = 0;
        for(int element: nums1)
        {
            ans[pos] = element;
            pos++;
        }
        for(int element: nums2)
        {
            ans[pos] = element;
            pos++;
        }
        System.out.println(Arrays.toString(ans));
      /*System.arraycopy() method can also be used to copy the elements in ans
        like: System.arraycopy(nums1,0,ans,0,nums1.length)
              System.arraycopy(nums2,0,ans,nums1.length,nums2.length) */

    }
}
