package com.saptak;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Next_greater_element_i {
    public static int[] helper(int[] nums1, int[] nums2)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int num: nums2)
        {
            if(!st.isEmpty() && st.peek() < num)
            {
                map.put(st.pop(), num);
            }
            st.push(num);
        }

        for(int i=0;i< nums1.length;i++)
        {
            nums1[i] = map.getOrDefault(nums1[i],-1);
        }
        return  nums1;

    }

    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] res = helper(nums1,nums2);
        System.out.println(Arrays.toString(res));
    }
}
