

public class UniquePathsII {
     public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int [][]dp=new int[m][n];
        for(int el[]:dp){
            Arrays.fill(el,-1);
        }
        return memo(m-1,n-1,obstacleGrid,dp);
    }

    public int memo(int row,int col,int[][] obstacleGrid,int[][] dp){
        if(row<0 || col<0){
            return 0;
        }
        if(obstacleGrid[row][col]==1){
            return 0;
        }
         if (row == 0 && col == 0){
             return 1;
         } 

         if(dp[row][col]!=-1){
            return dp[row][col];
         }
        int left=memo(row,col-1,obstacleGrid,dp);
        
          int up=memo(row-1,col,obstacleGrid,dp);
    
        return dp[row][col]=left+up;
    }
}
