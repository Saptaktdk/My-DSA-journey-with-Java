package com.saptak;
import java.util.Arrays;

//problem link: https://leetcode.com/problems/merge-sorted-array/

public class Merge_sorted_array {
    public static int[] helper(int[] nums1,int m, int[] nums2, int n)
    {
        for(int i=m,j=0;i<m+n;i++,j++)
        {
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3, n = 3;
        int[] res = helper(nums1, m, nums2, n);
        System.out.println(Arrays.toString(res));
    }
}
