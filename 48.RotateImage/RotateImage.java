
// 48. Rotate Image
//time complexity: O(n^2), where n is the length of the input matrix
//space complexity: O(1)

class RotateImage{
    public void rotate(int[][] matrix) {
        int m=matrix.length;
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
      
        for(int i=0;i<m;i++){
        int start=0,end=m-1;
        while(start<end){
            int temp=matrix[i][start];
            matrix[i][start]=matrix[i][end];
            matrix[i][end]=temp;
            start++;end--;
        }
        }
    }
}