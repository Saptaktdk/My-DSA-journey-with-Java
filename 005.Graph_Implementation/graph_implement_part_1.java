package com.saptak.Graph_Implementation;

//Using adjacency list

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class graph_implement_part_1 {
    private LinkedList<Integer> adjacency[];

    public graph_implement_part_1(int v) {
        adjacency = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjacency[i] = new LinkedList<Integer>(); //making the box of the vertices

        }
    }

    //function to insert an edge between 2 vertices
    public void insertedge(int s, int d) {
        adjacency[s].add(d);
        adjacency[d].add(s);

        System.out.print(adjacency[d]);
        System.out.print(adjacency[s]);
    }

    //function for bfs traversal
    public void bfs(int source)
    {
        boolean visited_nodes[] = new boolean[adjacency.length];
        int parent_nodes[] = new int[adjacency.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited_nodes[source] = true;
        parent_nodes[source] = -1;
        while(!q.isEmpty())
        {
            int p = q.poll();
            System.out.print(p);
            //now look for the adjacent nodes of the polled node
            for(int i:adjacency[p])
            {
                if(!visited_nodes[i])
                {
                    visited_nodes[i] = true;
                    //add the nodes to the queue
                    q.add(i);
                    //make it also a parent node
                    parent_nodes[i] = p;

                }

            }
        }

    }

    //function for dfs traversal
    public void dfs(int source)
    {
        boolean visited_nodes[] =  new boolean[adjacency.length];
        int parent_nodes[] = new int[adjacency.length];
        Stack<Integer> st = new Stack<>();
        st.add(source);
        visited_nodes[source] = true;
        parent_nodes[source] = -1;
        while(!st.isEmpty())
        {
            int p = st.pop();
            System.out.print(p);
            for(int i: adjacency[p])
            {
                if(!visited_nodes[i])
                {
                    visited_nodes[i] = true;
                    //push the nodes to the stack
                    st.push(i);
                    //make it to the parent node
                    parent_nodes[i] = p;
                }
            }
        }
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

        System.out.println();
        System.out.print("Enter the source: ");
        int source = sc.nextInt();
        g.bfs(source);
        System.out.println();
        g.dfs(source);
    }


}
