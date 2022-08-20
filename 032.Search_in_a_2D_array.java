package com.saptak;

public class Search_in_a_2D_array {
    public static boolean helper(int[][] matrix,int target)
    {
        int row = matrix.length;
        int col = matrix[0].length;
        //convert the 2D matrix into a 1D array
        int left = 0;
        int right = col*row - 1;

        while(left <= right)
        {
            //we can't find the mid element just by doing matrix[mid]
            // because we need to search it on the 2D array,
            // so to convert it back to 1D, we do this:

            int mid = left + (right - left)/2;

            int mid_val = matrix[mid / col][mid % col];
            if(mid_val == target)
            {
                return true;
            }
            else if(mid_val < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        boolean ans = helper(matrix,target);
        System.out.println(ans);
    }
}
