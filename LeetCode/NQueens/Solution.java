package LeetCode.NQueens;

import java.util.*;
public class Solution {
    public List<List<String>> solveNQueens(int n){
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        // initialise the board with '.'
        for(int i = 0; i < n; i++){
            Arrays.fill(board[i], '.');
        }
        backTrack(result, board, 0, n);
        return result;
    }
    private void backTrack(List<List<String>> result, char[][] board, int row, int n){
        if(row == board.length){
            result.add(construct(board));
            return;
        }

        for(int col = 0; col < n; col++){
            if(isSafe(board, row, col, n)){
                board[row][col] = 'Q';
                backTrack(result, board, row + 1, n);
                board[row][col] = '.';
            }
        }
    }
    private boolean isSafe(char[][] board, int row, int col, int n){
        // column
        for(int i = 0; i < row; i++){
            if(board[i][col] == 'Q') return false;
        }

        // upper left diagonal
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q') return false;
        }

        // upper right diagonal
        for(int i = row - 1, j = col + 1; i >= 0 && j < n; i-- , j++){
            if(board[i][j] == 'Q') return false;
        }
        return true;
    }

    private List<String> construct(char[][] board){
        List<String> res = new ArrayList<>();
        for(char[] row : board){
            res.add(new String(row));
        }
        return res;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 4;
        List<List<String>> res = sol.solveNQueens(n);
        System.out.println(res);
        
    }
}
