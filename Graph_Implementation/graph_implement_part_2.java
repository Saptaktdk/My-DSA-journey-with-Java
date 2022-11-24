package com.saptak.Graph_Implementation;

//Using adjacency matrix

import java.util.Scanner;

public class graph_implement_part_2 {

    public static void addEdge(int adjmatrix[][],int source, int dest)
    {
        //The edges are bidirectional
        adjmatrix[source][dest] = 1;
        adjmatrix[dest][source] = 1;

    }

    public static void displayMatrix(int matrix[][])
    {
        for(int i=0;i< matrix.length;i++)
        {
            for(int j=0;j< matrix[i].length;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vertices and edges: ");
        int v = sc.nextInt();
        int e = sc.nextInt();

        int a[][] = new int[v+1][v+1];

        addEdge(a,0,0);
        addEdge(a,0,1);
        addEdge(a,0,2);
        addEdge(a,2,3);

        displayMatrix(a);



    }



}
