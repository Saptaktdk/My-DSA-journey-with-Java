package com.saptak;

//problem link: https://leetcode.com/problems/valid-parentheses/

import java.util.Stack;

public class Valid_Parenthesis {
    public static boolean helper(String s)
    {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char x = s.charAt(i);
            if(x == '(' || x == '{' || x == '[')
            {
                st.push(x);
            }

            else if(st.empty()) return false;
            else if(
                    (x == ')' && st.pop() != '(') ||
                            (x == '}' && st.pop() != '{') ||
                            (x == ']' && st.pop() != '[')
            )
            {
                return false;
            }




        }
        return st.empty();
    }

    public static void main(String[] args) {
        String s = "()";
        boolean ans = helper(s);
        System.out.print(ans);
    }
}
