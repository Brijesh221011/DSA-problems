
// Problem 778. Swim in Rising Water
//time complexity:O(N^2 log(N^2)), where N is the length of one side of the grid
//space complexity:O(N^2), where N is the length of one side of the grid    


import java.util.PriorityQueue;

public class SwimInRisingWater {
    class Tuple{
        int t;
        int x;
        int y;
        Tuple(int t,int x,int y){
            this.t=t;
            this.x=x;
            this.y=y;
        }
    }
    public int swimInWater(int[][] grid) {
        int n=grid.length;
        PriorityQueue<Tuple>pq=new PriorityQueue<>((a,b)->a.t-b.t);
        int[][] vis=new int[n][n];
        pq.add(new Tuple(grid[0][0],0,0));
        vis[0][0]=1;

        while(!pq.isEmpty()){
            int time=pq.peek().t;
            int row=pq.peek().x;
            int col=pq.peek().y;
             pq.remove();

            if(row==n-1 && col==n-1){
                return time;
            }
            int[] dx={0,1,0,-1};
            int[] dy={1,0,-1,0};

            for(int i=0;i<4;i++){
                int newR=dx[i]+row;
                int newC=dy[i]+col;

                if(newR>=0 && newR<n && newC>=0 && newC<n && vis[newR][newC]==0){
                    pq.add(new Tuple(Math.max(grid[newR][newC],time),newR,newC));
                    vis[newR][newC]=1;
                }
            }
        }
        return -1;
    }
}
