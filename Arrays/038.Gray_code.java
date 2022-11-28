package com.saptak;

//problem description: https://leetcode.com/problems/gray-code/

import java.util.ArrayList;

public class Gray_code {
    public static ArrayList<Integer> helper(int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(n == 0) return list;
        list.add(0);
        list.add(1);
        int curr = 1;
        for(int i=2;i<=n;i++)
        {
            curr *= 2;

            for(int j=list.size()-1;j>=0;j--)
            {
                list.add(list.get(j) + curr);

            }

        }
        return list;
    }

    public static void main(String[] args) {
        int n = 2;
        ArrayList<Integer> res = helper(n);
        System.out.println(res);
    }
}
