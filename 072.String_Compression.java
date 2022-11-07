package com.saptak;

//Implement a method to perform basic string compression using the counts of repeated characters
//Time complexity: O(n), where n is the length of the string s

public class String_Compression {
    public static String helper(String s)
    {
       StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            int count = 1;
            while(i < s.length()-1 && s.charAt(i) == s.charAt(i+1))
            {
                i++;
                count++;
            }
            sb.append(s.charAt(i));
            if(count > 1)
            {
                sb.append(count);
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "aaabbcdd";
        String res = helper(s);
        System.out.print(res);

    }
}
