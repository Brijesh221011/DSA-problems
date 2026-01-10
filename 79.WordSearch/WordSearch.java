//79. Word Search
public class WordSearch {
     
     public boolean exist(char[][] board, String word) {
        int m=board.length,n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(check(0,i,j,word,board)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean check(int idx,int i,int j,String word,char[][] board){
        if(idx==word.length()){
            return true;
        }

        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=word.charAt(idx)){
            return false;
        }

        // Store character and mark visited
        char temp = board[i][j];
        board[i][j] = '#';

        boolean isFound=(check(idx+1,i+1,j,word,board) || check(idx+1,i,j+1,word,board) ||
                          check(idx+1,i-1,j,word,board) || check(idx+1,i,j-1,word,board));

        board[i][j]=temp;

        return isFound;
    }
}
