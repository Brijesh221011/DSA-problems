//problem 1020. Number of Enclaves
//time complexity: O(m*n), where m and n are the number of rows and columns in the grid.
//space complexity: O(m*n) for the queue and visited array.

import java.util.LinkedList;
import java.util.Queue;
public class NoOfEnclaves {
    class Pair{
        int x;
        int y;
          Pair(int x,int y){
            this.x=x;
            this.y=y;
          }
    }
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        int[][] vis=new int[m][n];
        Queue<Pair>q=new LinkedList<>();

        for(int i=0;i<m;i++){
            if(grid[i][0]==1){
                q.add(new Pair(i,0));
                vis[i][0]=1;
            }
            if(grid[i][n-1]==1){
                q.add(new Pair(i,n-1));
                vis[i][n-1]=1;
            }
        }

        for(int j=0;j<n;j++){
            if(grid[0][j]==1){
                q.add(new Pair(0,j));
                vis[0][j]=1;
            }
            if(grid[m-1][j]==1){
                q.add(new Pair(m-1,j));
                vis[m-1][j]=1;
            }
        }
        
        int dx[]={0,1,0,-1};
        int dy[]={1,0,-1,0};
        while(!q.isEmpty()){
           Pair p=q.remove();
           int row=p.x;
           int col=p.y;

           for(int i=0;i<4;i++){
            int newR=dx[i]+row;
            int newC=dy[i]+col;

            if(newR>=0 && newR<m && newC>=0 && newC<n && vis[newR][newC]!=1 && grid[newR][newC]==1){
                q.add(new Pair(newR,newC));
                vis[newR][newC]=1;
            }
           }
        }

        int noOfLand=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && vis[i][j]!=1){
                    noOfLand++;
                }
            }
        }
        return noOfLand;
    }
}
