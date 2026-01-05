//1975. Maximum Matrix Sum
//time complexity: O(m*n)
//space complexity: O(1)
public class MaximumMatSum {
    public long maxMatrixSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        long sum=0;
        int negCnt=0;
        int minVal=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int value=matrix[i][j];
                sum+=Math.abs(value);

                if(value<0){
                    negCnt++;
                }
                minVal=Math.min(minVal,Math.abs(value));
            }
        }
         if(negCnt%2==1){
           sum-=2L*minVal;
         }
       return sum;
    }
}
