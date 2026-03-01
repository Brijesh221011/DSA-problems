//Problem 73. Set Matrix Zeroes
//time complexity: O(m*n),where m and n are the number of rows and columns in the matrix respectively.
//space complexity: O(m+n),where m and n are the number of rows and columns in the matrix respectively.

class SetMatrixZero{
     public void setZeroes(int[][] mat) {
      int m=mat.length,n=mat[0].length;
       boolean[] row=new boolean[m];
       boolean[] col=new boolean[n];
       
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               if(mat[i][j]==0){
                   row[i]=true;
                   col[j]=true;
               }
           }
       }
       
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               if(row[i]==true || col[j]==true){
                   mat[i][j]=0;
               }
           }
       }
    }
}