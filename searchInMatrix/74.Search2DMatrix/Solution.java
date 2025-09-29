//package searchInMatrix.74.Search2DMatrix;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int []row:matrix){
            if(row[0]<=target && target<=row[row.length-1]){
                if(isSearch(row,target)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isSearch(int []row,int target){
        int start=0,end=row.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(row[mid]==target){
                return true;
            }else if(row[mid]<target){
               start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 30;
        boolean result = solution.searchMatrix(matrix, target);
        System.out.println("Target found: " + result); 
    }
}


