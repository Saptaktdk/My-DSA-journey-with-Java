package com.saptak;

//problem link: https://leetcode.com/problems/frequency-of-the-most-frequent-element/

public class Freq_of_most_freq_element {
    public static int helper(int[] nums, int k)
    {
        //****using sliding window technique****
        int i=0;
        int total_sum = 0;
        int max_freq = 0;
        for(int j=0;j< nums.length;j++)
        {
            total_sum += nums[j];
            while(k + total_sum < nums[j]*(j-i+1)) //(j-i+1) is the window lwngth
            {
                //sum can't be achieved in k moves , hence shrink the window
                total_sum -= nums[i];
                i++;

            }
            max_freq = Math.max(max_freq,(j-i+1));
        }
        return max_freq;
    }

    public static void main(String[] args) {
        int[] nums = {1,4,8,13};
        int k=5;
        int ans = helper(nums,k);
        System.out.println(ans);

    }
}
