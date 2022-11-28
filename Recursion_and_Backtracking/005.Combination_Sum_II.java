package com.saptak;

//problem link: https://leetcode.com/problems/combination-sum-ii/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Combination_sum_II {
    public static void helper(int[] cand, int target,int start,ArrayList<Integer> list,HashSet<ArrayList<Integer>> res)
    {
        if(target < 0)
        {
            return;
        }
        if(target == 0)
        {
            res.add(new ArrayList(list));
        }
        for(int i=start;i<cand.length;i++)
        {
            //logic to avoid duplicates
            if(i > start && cand[i]  == cand[i-1])
                continue;
            list.add(cand[i]);
            helper(cand,target-cand[i],i+1,list,res);
            list.remove(list.size()-1);

        }

    }

    public static ArrayList<ArrayList<Integer>> Combination(int[] candidates, int target)
    {
        HashSet<ArrayList<Integer>> res = new HashSet();
        Arrays.sort(candidates);
        helper(candidates,target,0,new ArrayList<>(),res);
        return new ArrayList(res);

    }

    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        ArrayList<ArrayList<Integer>> ans =  Combination(candidates,target);
        System.out.println(ans);
    }
}
