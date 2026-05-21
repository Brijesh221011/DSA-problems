
// 1463. Cherry Pickup II
//time complexity: O(m*n*n*9), where m is the number of rows and n is the number of columns in the grid. The 9 comes from the 3 possible moves for each of the two robots (3 for robot 1 and 3 for robot 2).
//space complexity: O(m*n*n), where m is the number of rows and n is the number of columns in the grid. 


class CherryPickup-II{
    public int cherryPickup(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        int[][][] dp=new int[m][n][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    dp[i][j][k]=-1;
                }
            }
        }

        return pickUp(0,0,n-1,grid,dp);
    }

    public int pickUp(int i,int j1,int j2,int[][] grid,int[][][] dp){
         int m=grid.length;
        int n=grid[0].length;
        //base case
        if(i<0 || i>=m || j1<0 || j1>=n || j2<0 || j2>=n){
            return (int) -1e9;
        }

        if(i==m-1){
            if(j1==j2){
                return grid[i][j1];
            }else{
                return grid[i][j1]+grid[i][j2];
            }
        }

        if(dp[i][j1][j2]!=-1){
            return dp[i][j1][j2];
        }

        int maxCherries=0;
        for(int dj1=-1;dj1<=1;dj1++){
            for(int dj2=-1;dj2<=1;dj2++){
                int rec=pickUp(i+1,j1+dj1,j2+dj2,grid,dp);
              if(j1==j2){
                maxCherries=Math.max(maxCherries,grid[i][j1]+rec);
              }else{
                maxCherries=Math.max(maxCherries,grid[i][j1]+grid[i][j2]+rec);
              }
            }
        }
        return dp[i][j1][j2]=maxCherries;
    }
}