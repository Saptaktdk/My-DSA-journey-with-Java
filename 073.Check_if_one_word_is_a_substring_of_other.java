package com.saptak;

public class Check_if_one_word_is_a_substring_of_other {
    public static void isRotation(String s1, String s2)
    {
        s1 = s1.concat(s1);
        isSubstring(s1,s2);
    }

    //function to check if s2 is a substring of s1
    public static void isSubstring(String s1, String s2)
    {
        boolean res = s1.contains(s2);
        if(s1.length() != s2.length())
        {
            System.out.print("false");
        }
        else
        {
            System.out.print(res);
        }
    }

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        isRotation(s1,s2);
    }
}
