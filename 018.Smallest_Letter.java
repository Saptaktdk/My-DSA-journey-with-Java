package com.saptak;

//problem link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class Smallest_Letter {
    public static char helper(char[] letters, char target)
    {
        char ans = letters[0];
        for(int i=0;i< letters.length;i++)
        {
            if(target < letters[i]) {
                ans = letters[i];
                break;

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
        char res = helper(letters, target);
        System.out.print(res);
    }
}
