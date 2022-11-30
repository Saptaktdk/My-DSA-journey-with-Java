package com.saptak;

import java.util.HashSet;
import java. util. Arrays;

//problem link: https://leetcode.com/problems/intersection-of-two-arrays/

public class Intersection_of_2arrays {
    public static int[] helper(int[] nums1, int[] nums2)
    {
        //using hashset to remove the duplicates
        HashSet<Integer>  Intersection = new HashSet<>();
        //sort the array
        Arrays.sort(nums1);
        //loop through nums2
        for(int num: nums2)
        {//if num found in both the arrays, add to the set
            if(find(num, nums1))
            {
                Intersection.add(num);
            }
        }
        //make a new array to store the elements of the set
        int[] res = new int[Intersection.size()];
        int i = 0;
        for(int x: Intersection)
        {
            res[i++] = x;
        }
        return res;


    }

    public static boolean find(int num, int[] nums)
    {
        int start = 0;
        int end = nums.length-1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(nums[mid] == num)
            {
                return true;
            }
            else if(nums[mid] < num)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }

        }
        return false;

    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] ans = helper(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }
}
