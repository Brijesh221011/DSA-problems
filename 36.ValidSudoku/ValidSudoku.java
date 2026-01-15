// 36.ValidSudoku;
//time complexity: O(1) since the board size is fixed 9x9
//space complexity: O(1)

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                char ch=board[i][j];
                board[i][j]='.';

                if(!isSafe(board,i,j,ch)){
                    return false;
                }
                board[i][j]=ch;
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
