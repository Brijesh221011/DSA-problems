// 1091. Shortest Path in Binary Matrix
//time complexity:O(n*n),where n is the number of rows or columns in the grid
//space complexity:O(n*n)

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInBinaryMat {
    class Tuple{
        int dis;
        int x;
         int y;
        Tuple(int dis,int x,int y){
            this.dis=dis;
            this.x=x;
            this.y=y;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
       if (grid[0][0] == 1 || grid[n-1][n-1] == 1) {
        return -1;
       }
         if (n == 1){
             return 1;
         }
        int[][]dist=new int[n][n];
        for(int [] el:dist){
            Arrays.fill(el,Integer.MAX_VALUE);
        }
        Queue<Tuple>q=new LinkedList<>();
              q.add(new Tuple(1,0,0));
               dist[0][0]=1;
           
          int[] dx={-1,-1,0,1,1,1,0,-1};
          int[] dy={0,1,1,1,0,-1,-1,-1};

            while(!q.isEmpty()){
            Tuple p=q.remove();
            int d=p.dis;
            int r=p.x;
            int c=p.y;
               
         
            for(int i=0;i<8;i++){
                  int newR=dx[i]+r;
                  int newC=dy[i]+c;

                  if(newR>=0 && newR<n && newC>=0 && newC<n && grid[newR][newC]==0 && dist[newR][newC]>1+d){
                     
                    dist[newR][newC]=1+d;
                    if(newR==n-1 && newC==n-1){
                        return d+1;
                    }
                    q.add(new Tuple(d+1,newR,newC));
                    
                  }
            }
        }
           return -1;
    }
}
