// 37.SudokuSolver
//time complexity: O(9^(n*n)) in worst case where n is the size of the board
//space complexity: O(1) since the board size is fixed 9x9

public class SudokuSolver {
     public void solveSudoku(char[][] board) {
        if (board == null || board.length == 0){
             return;
        }
           
        solve(board);
    }
    
    private boolean solve(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    for (char num = '1'; num <= '9'; num++) {
                        if (isSafe(board, row, col, num)) {
                            board[row][col] = num;
                            if (solve(board)) {
                                return true;
                            } else {
                                board[row][col] = '.'; // Backtrack
                            }
                        }
                    }
                    return false; // Tried all numbers 1-9, none worked
                }
            }
        }
        return true;
    }

     boolean isSafe(char[][] board,int row,int col,char c){
        for(int i=0;i<9;i++){
            if(board[row][i]==c || board[i][col]==c){
                return false;
            }
        }
         
         // 3*3 grid check
        int gRow=3*(row/3);
        int gCol=3*(col/3);

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[gRow+i][gCol+j]==c){
                    return false;
                }
            }
        }
        return true;
    }
}
