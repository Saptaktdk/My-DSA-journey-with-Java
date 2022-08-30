package com.saptak;

//problem link: https://leetcode.com/problems/word-search/

public class Word_Search {
    public static boolean helper(char[][]board, String word)
    {
        //backtracking
        int rows = board.length;
        int columns = board[0].length;

        //loop through the box
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if(word.charAt(0) == board[i][j] && searchword(i,j,0,board,word))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean searchword(int i, int j, int index, char[][] board, String word)
    {


        //corner cases
        if(index == word.length()) return true;

        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || word.charAt(index) != board[i][j])
        {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '*';
        if(searchword(i+1, j, index+1,board, word) ||
                searchword(i-1, j, index+1,board, word) ||
                searchword(i, j+1, index+1,board, word) ||
                searchword(i, j-1, index+1,board, word))
        {
            return true;
        }
        board[i][j] = temp;


        return false;


    }

    public static void main(String[] args) {
        char[][] board ={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        boolean ans = helper(board,word);
        System.out.println(ans);
    }

}
