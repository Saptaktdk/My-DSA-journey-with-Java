package com.saptak;

/*problem link: https://leetcode.com/problems/check-if-the-sentence-is-pangram/

Description: A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.*/

public class Pangram {

    public static boolean pangram(String sentence)
    {
        boolean[] ans = new boolean[26];
        for(int i=0;i<sentence.length();i++)
        {
            ans[sentence.charAt(i) -97] = true;
        }
        for(int j=0;j<26;j++)
        {
            if(ans[j] == false) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean result = pangram(sentence);
        System.out.println(result);
    }
}
