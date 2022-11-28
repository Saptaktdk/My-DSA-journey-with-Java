package com.saptak;

public class URLify_a_given_string {

    public static void helper(String s)
    {
        //first trim the string to delete trailing spaces
        s = s.trim();
        //replace the spaces with "%20", unicode for space is "\\s"
        s = s.replaceAll("\\s","%20");
        System.out.print(s);
    }

    public static void main(String[] args) {
        String s = "Hello World ";
        helper(s);
    }
}
