//memoization approach
//time complexity: O(m*n)
//space complexity: O(m*n) for dp array + O(m+n) for recursion stack


import java.util.Arrays;
public class MinimumPathSum {
     public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];

        for(int []el:dp){
        Arrays.fill(el,-1);
        }
        return memo(m-1,n-1,grid,dp);
    }

    public int memo(int row,int col,int[][] grid,int[][] dp){
        if(row<0 || col<0){
            return Integer.MAX_VALUE/2;
        }
        if(row==0 && col==0){
            return grid[0][0];
        }
         if(dp[row][col]!=-1){
            return dp[row][col];
         }
        int leftSum=grid[row][col]+memo(row,col-1,grid,dp);
        int upSum=grid[row][col]+memo(row-1,col,grid,dp);
        return dp[row][col]=Math.min(leftSum,upSum);
    }
}
