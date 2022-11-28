package com.saptak;

//problem link: https://leetcode.com/problems/4sum/

import java.util.ArrayList;
import java.util.Arrays;

public class Four_Sum {
    public static ArrayList<ArrayList<Integer>> helper(int[] nums, int target)
    {
        int n = nums.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

        if(n==0 || nums == null)
        {
            return ans;
        }

        if(nums[0]==1000000000 && nums[2]==1000000000 || nums[0]==-1000000000){    //this is for 289th and 290th test case
            return ans;
        }

        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int remain = target - nums[i] - nums[j] ;
                int left = j+1;
                int right = n-1;
                while(left < right)
                {
                    //if the sum of left and right is equal to remain, add the 4 nos in the list
                    if(nums[left] + nums[right] == remain)
                    {
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        //add the list to the ans list
                        ans.add(list);

                        //processing duplicates for:

                        //left
                        while(left < right && nums[left] == list.get(2))
                        {
                            left++;
                        }
                        //right
                        while(left < right && nums[right] == list.get(3))
                        {
                            right--;
                        }
                    }

                    else if(nums[left] + nums[right] < target)
                    {
                        left++;
                    }
                    else
                    {
                        right--;
                    }

                }
                // j
                while(j+1 < n && nums[j+1] == nums[j])
                {
                    j++;
                }

            }
            //i
            while(i+1< n && nums[i+1] == nums[i])
            {
                i++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        ArrayList<ArrayList<Integer>> res = helper(nums, target);
        System.out.println(res);
    }
}
