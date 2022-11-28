package com.saptak;

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
        //System.arraycopy() method can also be used to copy the elements in ans
        //like: System.arraycopy(nums1,0,ans,0,nums1.length)
        //System.arraycopy(nums2,0,ans,nums1.length,nums2.length)

    }
}
