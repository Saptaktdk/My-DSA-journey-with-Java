package com.saptak;

//problwm link: https://leetcode.com/problems/reach-a-number/

public class Reach_a_number {
    public static int helper(int target)
    {
        target = Math.abs(target);
        int sum = 0, steps = 0;
        while(sum < target)
        {
            sum += steps;
            steps++;
        }
        while((sum - target) % 2 == 1)
        {
            sum += steps;
            steps++;
        }
        return steps -1;
    }

    public static void main(String[] args) {
        int target = 2;
        int ans = helper(target);
        System.out.println(ans);
    }
}
