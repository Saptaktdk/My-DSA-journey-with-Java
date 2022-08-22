package com.saptak;
import java.util.Arrays;
//problem link: https://leetcode.com/problems/assign-cookies/

public class Assign_cookies {
    public static int helper(int[] g, int[] s)
    {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = g.length-1;
        int j = s.length-1;
        int child = 0;
        while(i>=0 && j>=0)
        {
            if(s[j] >= g[i])
            {
                i--;
                j--;
                child++;
            }
            else
            {
                i--;
            }
        }
        return child;

    }

    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        int res = helper(g,s);
        System.out.println(res);
    }
}
