package com.saptak;

//problem link: https://leetcode.com/problems/sqrtx/

public class Square_root {

    public static int sq_root(int x)
    {
        int start = 1;
        int end = x;
        int ans = 1;
        if(x == 0) return 0;
        if(x == 1) return 1;

        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(mid <= x/mid)
            {
                ans = mid;
                start = mid + 1;
            }
            else
            {
                end = mid -1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 9;
        int res = sq_root(x);
        System.out.println(res);
    }
}
