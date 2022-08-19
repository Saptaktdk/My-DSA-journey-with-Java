package com.saptak;

public class Find_Peak_Element {
    public static int helper(int[] nums)
    {
        //using modified Binary Search
        int start = 0;
        int end = nums.length-1;
        while(start < end)
        {
            int mid = start + (end - start)/2;
            if(nums[mid] < nums[mid+1])
            {
                start = mid + 1;
            }
            else
            {
                end = mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int ans = helper(nums);
        System.out.println(ans);
    }
}
