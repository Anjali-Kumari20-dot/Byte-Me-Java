package LeetCode.Sudoku;

import java.util.*;

public class Solution {
    public void solveSudoku(char[][] board){
        solve(board);
    }

    private boolean solve(char[][] board){
        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                if(board[row][col] == '.'){
                    for(char digit = '1'; digit <= '9'; digit++){
                        if(isSafe(board, row, col, digit)){
                            board[row][col] = digit;
                            if(solve(board)) return true;
                            board[row][col] = '.';
                        }
                    }
                    return false; // no digit found
                }
            }
        }
        return true; // solved!
    }
    private boolean isSafe(char[][] board, int row, int col, char digit){
        for(int i = 0; i < 9; i++){
            if(board[row][i] == digit || board[i][col] == digit) 
                return false;

            if(board[3 * (row/3) + i / 3][3 * (col/3) + i % 3] == digit)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        char[][] inp = {{'5','3','.','.','7','.','.','.','.'},
        {'6','.','.','1','9','5','.','.','.'},
        {'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','9'}};
        sol.solveSudoku(inp);

        for(char[] row : inp){
            System.out.println(Arrays.toString(row));
        }
    }
}
