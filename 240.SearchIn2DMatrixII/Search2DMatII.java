//240. Search a 2D Matrix II
//Time Complexity: O(m*log(n)), where m is the number of rows and n is the number of columns in the matrix.
//Space Complexity: O(1)

class Search2DMatII{
     public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;

        for(int i=0;i<m;i++){
            int start=0,end=n-1;

            while(start<=end){
                int mid=start+(end-start)/2;

                if(matrix[i][mid]==target){
                    return true;
                }else if(matrix[i][mid]<target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return false;
    }
}