
//74. Search a 2D Matrix
//Time Complexity: O(m*log(n)), where m is the number of rows and n is the number of columns in the matrix.
//Space Complexity: O(1)

class SearchA2DMat{
     public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;

         for(int i=0;i<m;i++){
            if(binarySearch(matrix[i],target)==true){
                return true;
            }
         }
         return false;
    }

     public boolean binarySearch(int[] arr,int target){
        int start=0,end=arr.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(arr[mid]==target){
                return true;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }
}