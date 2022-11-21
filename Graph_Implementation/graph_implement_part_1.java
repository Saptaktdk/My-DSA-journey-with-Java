package com.saptak.Graph_Implementation;

//Using adjacency list

import java.util.LinkedList;
import java.util.Scanner;

public class graph_implement_part_1 {
    private LinkedList<Integer> adjacency[];
    public graph_implement_part_1(int v)
    {
        adjacency = new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            adjacency[i] = new LinkedList<Integer>(); //making the box of the vertices

        }
    }

    //function to insert an edge between 2 vertices
    public void insertedge(int s, int d)
    {
        adjacency[s].add(d);
        adjacency[d].add(s);

        System.out.print(adjacency[d]);
        System.out.print(adjacency[s]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vertices and edges:");
        int v = sc.nextInt();
        int e = sc.nextInt();

        graph_implement_part_1 g = new graph_implement_part_1(v);
        System.out.print("Enter edge connections: ");
        for(int i=0;i<e;i++)
        {
            int s = sc.nextInt(); //enter source
            int d = sc.nextInt(); //enter destination
            g.insertedge(s,d);
        }
    }


}
