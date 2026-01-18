import java.util.LinkedList;
import java.util.Queue;

public class HighestPeak {
     class Tuple{
        int r;
        int c;
        int d;
        Tuple(int r,int c,int d){
            this.r=r;
            this.c=c;
            this.d=d;
        }
    }
    public int[][] highestPeak(int[][] isWater) {
        int m=isWater.length,n=isWater[0].length;
        int[][]res=new int[m][n];
        int vis[][]=new int[m][n];
        Queue<Tuple>q=new LinkedList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(isWater[i][j]==1){
                    q.add(new Tuple(i,j,0));
                    vis[i][j]=1;
                }else{
                    vis[i][j]=0;
                }
            }
        }

        int[] dx={0,1,0,-1};
        int[] dy={1,0,-1,0};

        while(!q.isEmpty()){
            Tuple t=q.remove();
            int x=t.r;
            int y=t.c;
            int dist=t.d;
            res[x][y]=dist;
            for(int i=0;i<4;i++){
                int row=dx[i]+x;
                int col=dy[i]+y;

                if(row>=0 && row<m && col>=0 && col<n && vis[row][col]!=1 && isWater[row][col]==0){
                    q.add(new Tuple(row,col,dist+1));
                    vis[row][col]=1;
                }
            }
            
           
        }
        return res;
    }
}
