
public class CountNegative {
     
     public int countNegatives(int[][] grid) {
        //time complexity:O(m*n)
        //   int m=grid.length;
        //   int n=grid[0].length;
        //  int cnt=0;

        //  for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(grid[i][j]<0){
        //             cnt++;
        //         }
        //     }
        //  }

        //  return cnt;

        //time complexity:O(m+n)

        int m=grid.length;
        int n=grid[0].length;
        int row=m-1;
        int col=0;
        int count=0;
        while(row>=0 && col<n){
            if(grid[row][col]<0){
              count+=n-col;
              row--;
            }else{
                col++;
            }
        }
          return count;

    }
}
