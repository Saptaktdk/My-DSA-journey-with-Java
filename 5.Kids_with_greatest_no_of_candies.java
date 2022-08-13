package com.saptak;

import java.util.ArrayList;
import java.util.List;

//problem link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

public class Kids_with_greatest_no_of_candies {
   public static List<Boolean> candies(int[] candies, int extracandies)
   {
       List<Boolean> ans = new ArrayList<>();
       int n = candies.length;
       for (int i=0;i<n;i++)
       {
           boolean test = false;
           for(int j=0;j<n;j++)
           {
               if(candies[i] + extracandies < candies[j])
               {
                   test = true;
                   break;
               }
           }
           if(test) ans.add(false);
           else
           {
               ans.add(true);
           }
       }
       return  ans;

   }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extracandies = 3;

        List<Boolean> res = candies(candies,extracandies);
        System.out.println(res);
    }
}
