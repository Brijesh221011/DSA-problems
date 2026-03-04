
//1582. Special Positions in a Binary Matrix
//time complexity:O(m*n),where m and n are the number of rows and columns in the input matrix respectively.
//space complexity:O(m+n),where m and n are the number of rows and columns in the input matrix respectively.

class SpacialPositionsInBMatrix {
     public int numSpecial(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[] rowCnt=new int[m];
        int []colCnt=new int[n];
        int cnt=0;
        for(int i=0;i<m;i++){
         for(int j=0;j<n;j++){
            if(mat[i][j]==1){
                rowCnt[i]++;
                colCnt[j]++;
            }
         }
        }

        for(int i=0;i<m;i++){
         for(int j=0;j<n;j++){
            if(mat[i][j]==1 && rowCnt[i]==1 && colCnt[j]==1){
                cnt++;
            }
         }
        }
        return cnt;
    }
}