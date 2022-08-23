package com.saptak;

import java.util.Arrays;

public class Sort_array_by_parity2 {
    public static int[] helper(int[] nums)
    {
        int n = nums.length;
        int[] res = new int[n];
        int e=0;
        int o=1;
        for(int i=0;i<n;i++)
        {
            if(nums[i] % 2 == 0)
            {
                res[e] = nums[i];
                e += 2;
            }
            else
            {
                res[o] = nums[i];
                o += 2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4,2,5,7};
        int[] ans = helper(nums);
        System.out.println(Arrays.toString(ans));
    }
}
