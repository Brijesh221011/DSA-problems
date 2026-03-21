
// 3643. Flip Square Sub-Matrix Vertically
//time complexity: O(k^2)
//space complexity: O(1)


class FlipSquareSubMatrix {
     public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int m=grid.length,n=grid[0].length;

        for(int j=y;j<y+k;j++){
            int start=x,end=x+k-1;

            while(start<=end){
                int temp=grid[start][j];
                grid[start][j]=grid[end][j];
                grid[end][j]=temp;
                start++;
                end--;
            }
        }
        return grid;
    }
}