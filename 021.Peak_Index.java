package com.saptak;

//problem link: https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class Peak_Index {
    public static int helper(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start < end) //doing start < end and right = mid as we have to include the range
        {
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid+1])
            {
                start = mid + 1;
            }
            else
            {
                end = mid ;
            }

        }
        return start;

    }

    public static void main(String[] args) {
        int[] arr = {0,1,0};
        int ans = helper(arr);
        System.out.println(ans);
    }

}
