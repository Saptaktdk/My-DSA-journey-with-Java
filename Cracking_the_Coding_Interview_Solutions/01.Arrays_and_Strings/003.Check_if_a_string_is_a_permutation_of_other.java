package com.saptak;

import java.util.Arrays;

public class Check_if_a_string_is_a_permutation_of_other {

    public static boolean helper(String s1,String s2)
    {
       if(s1.length() != s2.length())
       {
           return false;
       }
       char[] c1 = s1.toCharArray();
       char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String a = new String(c1);
        String b = new String(c2);

        return a.equals(b);



    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bca";
        boolean ans = helper(s1, s2);
        System.out.print(ans);
    }


}
