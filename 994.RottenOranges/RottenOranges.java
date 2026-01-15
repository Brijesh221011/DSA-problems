//Problem 994: Rotting Oranges
//time complexity: O(m*n), where m is number of rows and n is number of columns
//space complexity: O(m*n)

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    
    class Tuple{
        int x;
        int y;
        int t;

        Tuple(int x,int y,int t){
            this.x=x;
            this.y=y;
            this.t=t;
        }
    }
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
         Queue<Tuple>q=new LinkedList<>();
         int[][]vis=new int[m][n];

         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new Tuple(i,j,0));
                    vis[i][j]=2;
                }else{
                    vis[i][j]=0;
                }
            }
         }

         int reqTime=0;
         int dx[]={0,1,0,-1};
         int dy[]={1,0,-1,0};

         while(!q.isEmpty()){
            Tuple tp=q.remove();
            int r=tp.x;
            int c=tp.y;
            int time=tp.t;

            reqTime=Math.max(reqTime,time);

            for(int i=0;i<4;i++){
                int newR=dx[i]+r;
                int newC=dy[i]+c;

                if(newR>=0 && newR<m && newC>=0 && newC<n && vis[newR][newC]!=2 && grid[newR][newC]==1){
                    q.add(new Tuple(newR,newC,time+1));
                    vis[newR][newC]=2;
                }
            }
         }

         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]!=2 && grid[i][j]==1){
                    return -1;
                }
            }
         }
         return reqTime;
    }
}
