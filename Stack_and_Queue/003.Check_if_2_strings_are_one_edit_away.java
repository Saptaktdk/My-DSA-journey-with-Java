package com.saptak;

import java.util.HashMap;

public class Check_if_2_strings_are_one_edit_away {
    public static void helper(String s1, String s2)
    {

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s2.length();i++)
        {
            char ch = s2.charAt(i); ///ple
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int count = 0;
        for(int i=0;i<s1.length();i++)
        {
            char ch = s1.charAt(i); //pale
            if(!map.containsKey(ch))
            {
                count++;
            }
        }


        if(count == 1)
        {
            System.out.print(true);
        }
        else
        {
            System.out.print(false);
        }

    }

    public static void main(String[] args) {
        String s1 = "pale";
        String s2 = "bale";
        if(s1.length() < s2.length())
        {
            helper(s2,s1);
        }
        else
        {
            helper(s1,s2);
        }

    }

}
