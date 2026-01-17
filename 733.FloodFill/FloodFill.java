
public class FloodFill {
     public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initColor=image[sr][sc];
        int[][]res=image;
        int dx[]={-1,0,1,0};
        int dy[]={0,1,0,-1};
        dfs(sr,sc,res,image,color,initColor,dx,dy);
        return res;
    }

    public void dfs(int row,int col,int[][]res,int[][] image,int newColor,int initColor,int[] dx,int[] dy){
              res[row][col]=newColor;
              int n=image.length;
              int m=image[0].length;
              for(int i=0;i<4;i++){
                int nrow=row+dx[i];
                int ncol=col+dy[i];

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m &&
                 image[nrow][ncol]==initColor && res[nrow][ncol]!=newColor){
                    dfs(nrow,ncol,res,image,newColor,initColor,dx,dy);
                 }
              }
    }
}
