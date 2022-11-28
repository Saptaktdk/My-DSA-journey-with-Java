package com.saptak;

import java.util.ArrayList;
import java.util.Arrays;

//problem link; https://leetcode.com/problems/intersection-of-two-arrays-ii/


public class Intersection_of_2arrays_II {
    public static int[] helper(int[] nums1, int[] nums2)
    {
        //using list to include all the duplicate values
        ArrayList<Integer> list = new ArrayList<>();
        //using iterators to iterate through the 2 arrays
        int i=0, j=0;
        //sort the 2 arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        //start iteration
        while(i< nums1.length && j< nums2.length )
        {
            if(nums1[i] == nums2[j])
            {
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }
        //create an array to conatin the elements of the list
        int[] res = new int[list.size()];
        int k = 0;
        for(int x: list)
        {
            res[k++] = x;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] ans = helper(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }
}
