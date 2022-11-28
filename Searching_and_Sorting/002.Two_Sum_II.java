package com.saptak;

//problem link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

import java.util.Arrays;

public class Two_Sum_II {
    public static int[] helper(int[] numbers,int target)
    {
        int start = 0, end = numbers.length-1;

        while(start <= end)
        {
            int sum = numbers[start] + numbers[end];
            if(sum == target)
            {
               return new int[] {start+1, end+1};
            }

            else if(sum < target)
            {
                start++;
            }

            else
            {
                end--;
            }

        }
        return new int[] {start +1,end+1};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = helper(nums, target);
        System.out.println(Arrays.toString(res));
    }
}
