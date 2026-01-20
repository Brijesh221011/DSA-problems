//Problem 200. Number of Islands
//time complexity: O(m*n), where m and n are the number of rows and columns in the grid.
//space complexity: O(m*n) for the visited array and recursion stack.

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
         int m=grid.length,n=grid[0].length;

         int vis[][]=new int[m][n];
         int cnt=0;
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]!=1 && grid[i][j]=='1'){
                    cnt++;
                    dfs(i,j,grid,vis);
                }
            }
         }
         return cnt;
    }

    public void dfs(int row,int col,char[][] grid,int[][] vis){
        int m=grid.length,n=grid[0].length;
        vis[row][col]=1;

        int[] dx={0,1,0,-1};
        int[] dy={1,0,-1,0};

        for(int i=0;i<4;i++){
            int newR=dx[i]+row;
            int newC=dy[i]+col;

            if(newR>=0 && newR<m && newC>=0 && newC<n && vis[newR][newC]!=1 && grid[newR][newC]=='1'){
                  dfs(newR,newC,grid,vis);
            }
        }
    }
}
