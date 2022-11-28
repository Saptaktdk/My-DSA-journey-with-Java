package com.saptak;

import java.util.HashMap;

//Check if the a string contains all unique characters or not

public class Check_if_string_contains_unique_characters {

    public static boolean helper(String s)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(map.get(ch) > 1)
            {
                return false;
            }
        }

        return  true;
    }

    public static void main(String[] args) {
        String s = "abcdefghrida";
        boolean ans = helper(s);
        System.out.print(ans);
    }
}
