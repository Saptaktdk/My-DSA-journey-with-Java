package com.saptak.Shortest_Path_Algorithms;

import java.util.Scanner;

public class Dijktras_Algorithm {
    public static void Dijktra(int[][] adjacency_matrix)
    {
        int v = adjacency_matrix.length;
        boolean visited[] = new boolean[v];
        int distance[] = new int[v];

        //set the weights of the nodes initially infinity except the first vertex
        distance[0] = 0;
        for(int i=1;i<v;i++)
        {
            distance[i] = Integer.MAX_VALUE;
        }

        for(int i=0; i<v-1;i++)
        {
            //Find Vertex with Min  distance
            int minVertex = findMinVertex(distance,visited);
            //mark the minVertex visited
            visited[minVertex] = true;
            //Explore the neighbours
            for(int j=0;j<v;j++)
            {
                if(adjacency_matrix[minVertex][j] != 0 && !visited[j] && distance[minVertex] != Integer.MAX_VALUE)
                {
                    int newDist = distance[minVertex] + adjacency_matrix[minVertex][j];
                    if(newDist < distance[j])
                    {
                        //update the distance
                        distance[j] = newDist;
                    }
                }
            }

        }
        //print
        for(int i=0;i<v;i++)
        {
            System.out.println(i + " " + distance[i]);
        }

    }

    private static int findMinVertex(int[] distance, boolean[] visited) {
        int minVertex = -1;
        for (int i = 0; i < distance.length; i++)
        {
            if(!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex]))
            {
                minVertex = i;
            }
        }
        return minVertex;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vertices and Edges: ");
        int v = sc.nextInt();
        int e = sc.nextInt();
        //the adjacency matrix will contain the weights of the nodes
        int adjacency_matrix[][] = new int[v][v];
        System.out.println("Enter edge connections: ");
        for(int i=0;i<e;i++)
        {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();
            adjacency_matrix[v1][v2] = weight;
            adjacency_matrix[v2][v1] = weight;
        }
        Dijktra(adjacency_matrix);

        //Time_Complexity: o(v*v)
    }
}
