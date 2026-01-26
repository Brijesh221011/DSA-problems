//Problem 1631. Path With Minimum Effort
//time complexity: O(m*nlog(m*n)),where m and n are the dimensions of the input matrix
//space complexity: O(m*n)

import java.util.Arrays;
import java.util.PriorityQueue;


public class PathMinEffort {
    
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
    public int minimumEffortPath(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;
        PriorityQueue<Tuple>pq=new PriorityQueue<>((a,b)->a.dis-b.dis);
        int[][]dist=new int[m][n];
        for(int [] el:dist){
            Arrays.fill(el,Integer.MAX_VALUE);
        }
        
        pq.add(new Tuple(0,0,0));
        dist[0][0]=0;

        int[] dx={0,1,0,-1};
        int[] dy={1,0,-1,0};

        while(!pq.isEmpty()){
            Tuple t=pq.remove();
            int diff=t.dis;
            int r=t.x;
            int c=t.y;
 
            if(r==m-1 && c==n-1){
                return diff;
            }
            for(int i=0;i<4;i++){
                int newR=dx[i]+r;
                int newC=dy[i]+c;

                 
                if(newR>=0 && newR<m && newC>=0 && newC<n){
                    int maxDiff=Math.max(diff,Math.abs(heights[newR][newC]-heights[r][c]));

                    if(dist[newR][newC]>maxDiff){
                        dist[newR][newC]=maxDiff;
                        pq.add(new Tuple(maxDiff,newR,newC));
                    }
                }
            }

        }
        return -1;
    }
}
