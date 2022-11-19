package com.saptak.Tree_Traversals;

public class Tree {
    Node root;
    static class Node
    {
        int val;
        public Node left;
        public Node right;

        //constructor
        public Node(int val)
        {
            this.val = val;
            left = right = null;
        }
    }



    //function to search a node in the tree
    public static boolean searchRecursively(Node root, int value)
    {
        if(root == null)
        {
            return false;
        }
        if(root.val == value)
        {
            return true;
        }
        if(value < root.val)
        {
            return searchRecursively(root.left,value);
        }
        else if(value > root.val)
        {
            return searchRecursively(root.right,value);
        }
        return false;
    }

    //function to insert node in the tree
    public static Node insertRecursively(Node root, int value)
    {
        if(root == null)
        {
            return new Node(value);
        }
        if(value < root.val)
        {
            root.left =  insertRecursively(root.left,value);
        }
        else if(value > root.val)
        {
            root.right =  insertRecursively(root.right,value);
        }
        return root;

    }

    //function to delete a node from a tree
    public static Node deleteRecursively(Node root, int value)
    {
        if(root == null)
        {
            return root;
        }
        if(value < root.val)
        {
            root.left =  deleteRecursively(root.left,value);
        }
        else if(value > root.val)
        {
            root.right =  deleteRecursively(root.right,value);
        }
        else
        {
            //check if the node has children or not
            if(root.left == null)
            {
                return root.right; //if left child is null, return right child
            }
            else if(root.right == null)
            {
                return root.left; //if right child is null, return left child
            }
            else {
                //look for the next highest element(inorder successor) in the right subtree
                //replace the node to be removed with the inorder successor.
                //delete the inorder successor replica
                root.val = inorderSuccessor(root.right);
                root.right = deleteRecursively(root.right, root.val);

            }
        }
        return root;

    }

    public static int inorderSuccessor(Node root)
    {
        int minimum = root.val;
        //go to the leftmost element of the tree to find the minimum element
        while(root.left != null)
        {
            minimum = root.left.val;
            root = root.left;
        }
        return minimum;
    }

    //print the tree in inorder traversal
    public static void printInOrderTraversal(Node root)
    {
        if (root != null)
        {
            printInOrderTraversal(root.left);
            System.out.printf(root.val + " ");
            printInOrderTraversal(root.right);
        }
    }

    //main
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node(6);
        tree.root.left = new Node(1);
        tree.root.right = new Node(8);
        tree.root.left.left = new Node(0);
        tree.root.left.right = new Node(5);

        printInOrderTraversal(tree.root);

        System.out.println();

        System.out.println(searchRecursively(tree.root,4));

        tree.root = insertRecursively(tree.root,2);
        System.out.println(searchRecursively(tree.root,2));
        printInOrderTraversal(tree.root);

        System.out.println();

        tree.root = deleteRecursively(tree.root,5);
        System.out.println(searchRecursively(tree.root,5));
        printInOrderTraversal(tree.root);


    }
}
