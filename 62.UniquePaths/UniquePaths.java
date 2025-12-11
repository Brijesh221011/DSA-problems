//memoization approach
//time complexity: O(m*n)
//space complexity: O(m*n) for memoization + O(m+n) for recursion stack
import java.util.Arrays;

public class UniquePaths {
      public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];

        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return rec(m-1,n-1,m,n,dp);
    }

    public int rec(int row,int col,int m,int n,int[][]dp){
        if(row<0 || col<0){
            return 0;
        }
         if(row==0 && col==0){
            return 1;
         }
         
         if(dp[row][col]!=-1){
            return dp[row][col];
         }
         int left=rec(row,col-1,m,n,dp);
          int up=rec(row-1,col,m,n,dp);
         
         return dp[row][col]=left+up;
    }
}
