package com.saptak;

//problem link: https://leetcode.com/problems/add-binary/

public class Add_Binary {
    public static String helper(String a, String b)
    {
        int i = a.length()-1;
        int j = b.length()-1;
        int sum, carry = 0;
        StringBuilder sb = new StringBuilder();
        while(i>=0 || j>=0)
        {
            sum = carry;
            if(i>=0) sum += a.charAt(i) - '0'; //converting the character to integer
            if(j>=0) sum += b.charAt(j) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;

        }
        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();

    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        String ans = helper(a,b);
        System.out.print(ans);
    }
}
