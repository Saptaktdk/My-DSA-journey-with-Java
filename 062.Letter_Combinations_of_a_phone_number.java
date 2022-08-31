package com.saptak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//problem link: https://leetcode.com/problems/letter-combinations-of-a-phone-number/

public class Letter_Combinations_of_a_phone_number {

    private static HashMap<Character,ArrayList<String>> map = new HashMap<>();
    public static ArrayList<String> helper(String digits)
    {
        map.put('1', new ArrayList<>());
        map.put('2', new ArrayList<>(Arrays.asList("a","b","c")));
        map.put('3', new ArrayList<>(Arrays.asList("d","e","f")));
        map.put('4', new ArrayList<>(Arrays.asList("g","h","i")));
        map.put('5', new ArrayList<>(Arrays.asList("j","k","l")));
        map.put('6', new ArrayList<>(Arrays.asList("m","n","o")));
        map.put('7', new ArrayList<>(Arrays.asList("p","q","r","s")));
        map.put('8', new ArrayList<>(Arrays.asList("t","u","v")));
        map.put('9', new ArrayList<>(Arrays.asList("w","x","y","z")));
        map.put('0', new ArrayList<>());

        ArrayList<String> res = new ArrayList<>();
        if(digits.length() == 0 || digits == null) return res;

        helper(res, digits,0,"");
        return res;
    }

    private static void helper(ArrayList<String> res, String digits, int index, String string)
    {
        //base condition
        if(index == digits.length())
        {
            res.add(string);
            return;
        }


        char ch = digits.charAt(index);
        ArrayList<String> letters = map.get(ch);
        for(int i=0;i<letters.size();i++)
        {
            String letter = letters.get(i);
            helper(res,digits, index+1,string + letter);
        }
    }

    public static void main(String[] args) {
        String digits = "23";
        ArrayList<String> ans = helper(digits);
        System.out.print(ans);
    }
}
