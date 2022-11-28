package com.saptak;

//Write a program such that if an element in a mxn matrix is zero, set the entire row and column are set to zero

import java.util.Arrays;
import java.util.HashSet;

public class Zero_Matrix {
    public static void setZero(int[][] matrix)
    {
        //create two hashsets to store the rows and columns that contains zeroes
        HashSet<Integer> rows_having_zeroes = new HashSet<>();
        HashSet<Integer> columns_having_zeroes = new HashSet<>();

        //Loop through the array to find elements valued zero
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j< matrix[i].length;j++)
            {
                if(matrix[i][j] == 0)
                {
                    //if the row_set doesn't contain the column of the element exists, add it
                    if(!rows_having_zeroes.contains(i))
                    {
                        rows_having_zeroes.add(i);
                    }
                    //if the column_set doesn't contain  the column of the element exists, add it
                    if(!columns_having_zeroes.contains(j))
                    {
                        columns_having_zeroes.add(j);
                    }

                }
            }

        }

        //convert all the elements existing in the rows that are present in the row set to zeroes
        for(int r: rows_having_zeroes)
        {
            for(int c=0;c< matrix[0].length;c++)
            {
                matrix[r][c] = 0;
            }
        }

        //convert all the elements existing in the columns that are present in the column set to zeroes
        for(int c: columns_having_zeroes)
        {
            for(int r=0;r< matrix.length;r++)
            {
                matrix[r][c] = 0;
            }
        }

        //print the matrix
        System.out.println();
        for(int i=0;i<matrix.length;i++)
        {
            System.out.println(Arrays.toString(matrix[i]));
        }




    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},
                          {4,0,5},
                          {6,7,8}};
        setZero(matrix);

    }


}
