package com.saptak.Shortest_Path_Algorithms;

//Floyd Warshall Algorithm

public class Floyd_Warshall_Algorithm {

    static int[][] p;
    static final int N = 4;

    public static int[][] Flyod_Warshall(int[][] matrix)
    {
        for(int k=0;k<N;k++)
        {
            for(int i=0;i<N;i++)
            {
                for(int j=0;j<N;j++)
                {
                    //keeping track of intermediate nodes
                    if(matrix[i][k] + matrix[k][j] < matrix[i][j])
                    {
                        matrix[i][j] = matrix[i][k] + matrix[k][j];
                        p[i][j] = k; //making the intermediate path matrix
                    }
                    // or if you don't want to keep track of the intermediate nodes
                    //  matrix[i][j] = min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                }

            }
        }
        return matrix;

    }

    public static int min(int i, int j)
    {
        if(i < j)
        {
            return i;
        }
        return j;
    }

    public static void print_matrix(int[][] matrix)
    {
        System.out.print("\n\t");
        for(int j=0;j<N;j++)
        {
            System.out.print(j + "\t");
        }
        System.out.println();
        for(int i=0;i<35;i++)
        {
            System.out.print("-");
        }
        System.out.println();
        for(int i=0;i<N;i++)
        {
            System.out.print(i + "|\t");
            for(int j=0;j<N;j++)
            {
                System.out.print(matrix[i][j]);
                System.out.print("\t");
            }
            System.out.println("\n");
        }
        System.out.println("\n");

    }

    public static void main(String[] args) {
        //initialize the matrix
        int[][] matrix = {{0,5,999,999},{50,0,15,5},{30,999,0,15},{15,999,5,0}};

        //for the path matrix
        p = new int[N][N];
        System.out.println("Matrix to find the shortest path: ");
        print_matrix(matrix);
        System.out.println("Shortest Path Matrix: ");
        print_matrix(Flyod_Warshall(matrix));
        System.out.println("Path matrix: ");
        print_matrix(p);

    }
}
