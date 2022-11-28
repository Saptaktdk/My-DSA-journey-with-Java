package com.saptak;

public class Armstrong_No {
    public static boolean helper(int num)
    {
        int  n = 0, rem = 0, sum = 0;
        int temp = num;
        int temp1 = num;

        //first find no of digits in the num
        while(temp1 > 0)
        {
            temp1 /= 10;
            n++;
        }

        //armstrong no logic

        while(temp > 0)
        {
            rem = temp % 10;
            sum += Math.pow(rem,n);
            temp /= 10;

        }
        if(sum == num) return true;
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 1634;
        boolean res = helper(num);
        System.out.println(res);

    }
}
