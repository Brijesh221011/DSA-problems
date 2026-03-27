
// 2946. Matrix Similarity After Cyclic Shifts
//time: O(m*n) , where m is the number of rows and n is the number of columns in the matrix
// space: O(1)

class MatrixSimilarity{

     public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;
        k = k % n;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               int newIdx;

               if(i%2==0){ //left rotate
                  newIdx=(j+k)%n;
               }else{ //right rotate
                   newIdx=(j-k+n)%n;
               }

               if(mat[i][j]!=mat[i][newIdx]){
                return false;
               }
            }
        }
        return true;
    }
}