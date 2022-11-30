package com.saptak;

//problem link: https://leetcode.com/problems/self-dividing-numbers/

import java.util.ArrayList;

public class Self_Dividing_Numbers {
    public static ArrayList<Integer> helper(int left, int right)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(isdivisible(i))
            {
                list.add(i);
            }


        }
        return list;
    }

    public static boolean isdivisible(int n)
    {
        int temp = n;
        while(n > 0)
        {
            int rem = n % 10;
            if(rem == 0) return false;
            if(temp % rem != 0)
            {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int left = 47, right = 85;
        ArrayList<Integer> ans = helper(left, right);
        System.out.println(ans);
    }
}
