package com.saptak;

//problem link: https://leetcode.com/problems/combination-sum-iii/

import java.util.ArrayList;

public class Combination_sum_III {
    public static ArrayList<ArrayList<Integer>> combination(int k, int n)
    {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        helper(k,n,1,new ArrayList(), res);
        return new ArrayList(res);


    }

    public static void helper(int k, int n, int start, ArrayList<Integer> list,ArrayList<ArrayList<Integer>> res)
    {
        //base cases
        if(k < 0 || n < 0)
            return;
        if(k == 0 && n == 0)
            res.add(new ArrayList(list));

        for(int i=start;i<=9;i++)
        {
            list.add(i);
            helper(k-1,n-i,i+1,list,res);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        int k=3;
        int n=7;
        ArrayList<ArrayList<Integer>> ans = combination(k,n);
        System.out.println(ans);
    }
}
