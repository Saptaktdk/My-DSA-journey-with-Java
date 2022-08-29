package com.saptak;

//problem link: https://leetcode.com/problems/first-unique-character-in-a-string/

import java.util.HashMap;

public class First_Unique_Character_in_a_String {
    public static int helper(String s)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        int n = s.length();

        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);
            if(!map.containsKey(c))
            {
                map.put(c,1);
            }
            else
            {
                map.put(c, map.get(c)+1);
            }
        }

        for(int i=0;i<n;i++)
        {
            if(map.get(s.charAt(i)) == 1) return i;
        }

        return -1;

    }

    public static void main(String[] args) {
        String s = "leetcode";
        int ans = helper(s);
        System.out.println(ans);
    }

}
