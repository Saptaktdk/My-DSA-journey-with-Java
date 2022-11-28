package com.saptak;

import java.util.ArrayList;

public class Generate_Permutation_of_a_String {
    public static void permutations(String prefix, String s)
    {
        if(s.length() == 0)
        {
            System.out.print(prefix + " ");
        }
        else
        {
            for(int i=0;i<s.length();i++)
            {
                permutations(prefix + s.charAt(i), s.substring(0,i) + s.substring(i+1));
            }
        }


    }

    public static void main(String[] args) {
        String str = "ABC";
        permutations("",str);
    }
}
