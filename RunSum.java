package com.saptak;

//Find the running sum of an 1d array
public class RunSum {

    public static int[] runningsum(int[] arr)
    {
        int[] res = new int[arr.length];
        if(arr.length == 0) return res;
        res[0] =arr[0];
        for(int i=1;i<arr.length;i++)
        {
            res[i] = res[i-1] + arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] res = runningsum(arr);
        System.out.print("[");
        for(int i=0;i<res.length-1;i++)
        {
            System.out.print(res[i] + ",");
        }
        System.out.print(res[res.length-1] + "]");

    }

}
