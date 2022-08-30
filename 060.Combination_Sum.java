package com.saptak;

//problem link: https://leetcode.com/problems/combination-sum/

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {
    //A backtracking problem
    public static List<List<Integer>> helper(int[] cand, int target)
    {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(cand,target,0,new ArrayList(),res);
        return res;

    }

    public static void backtrack(int[] cand, int target, int start, List<Integer> list, List<List<Integer>> res)
    {
        //base case
        if(target < 0) return;

        if(target == 0)
        {
            res.add(new ArrayList(list));
        }
        for(int i=start;i< cand.length;i++)
        {
            list.add(cand[i]);
            backtrack(cand, target-cand[i],i,list,res);
            //when we come to case target < 0, remove the last item of the list
            list.remove(list.size()-1);
        }

    }

    public static void main(String[] args) {
        int[] cand = {2,3,6,7};
        int target = 7;
        List<List<Integer>> ans = helper(cand,target);
        System.out.println(ans);
    }
}
