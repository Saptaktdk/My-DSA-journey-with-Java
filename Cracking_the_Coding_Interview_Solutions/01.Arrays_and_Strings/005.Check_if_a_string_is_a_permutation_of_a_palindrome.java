package com.saptak;

import java.util.HashMap;

public class Check_if_a_string_is_a_permutation_of_a_palindrome {

    public static void palindrome(String s)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
           char ch = s.charAt(i);
           map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count = 0;

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);

            if(map.get(ch) % 2 != 0)
            {
                count++;
            }

        }
        if(count == 1)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }

    }

    public static void main(String[] args) {
        String s = "Tact Coa ";
        s = s.replaceAll(" ","");
        s = s.toLowerCase();
        palindrome(s);
    }


}