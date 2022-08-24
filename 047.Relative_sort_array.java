package com.saptak;

import java.util.Arrays;

public class Relative_sort_array {
    public static int[] helper(int[] nums1, int[] nums2)
    {
        //creating a frequency array of nums1
        int[] freq = new int[10001];
        int pos = 0;
        for(int i = 0;i< nums1.length;i++)
        {
            freq[nums1[i]]++;
        }
        for(int j=0;j< nums2.length;j++)
        {
            while(freq[nums2[j]]-- > 0)
            {
                nums1[pos++] = nums2[j];
            }
        }

        for(int i=0;i< freq.length;i++)
        {
            while(freq[i]-- > 0)
            {
                nums1[pos++] = i;
            }
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] nums2 = {2,1,4,3,9,6};
        int[] res = helper(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }
}
