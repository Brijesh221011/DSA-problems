//time complexity:O(m*n)
//space complexity:O(1)

import java.util.ArrayList;
import java.util.List;
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>res=new ArrayList<>();
        int m=matrix.length,n=matrix[0].length;
        int startR=0,endR=m-1;
        int startC=0,endC=n-1;

        while(startR<=endR && startC<=endC){
            for(int j=startC;j<=endC;j++){
                res.add(matrix[startR][j]);
            }

            for(int i=startR+1;i<=endR;i++){
                res.add(matrix[i][endC]);
            }
             
             if(startR<endR){
            for(int j=endC-1;j>=startC;j--){
                res.add(matrix[endR][j]);
            }
             }

             if(startC<endC){
            for(int i=endR-1;i>=startR+1;i--){
                res.add(matrix[i][startC]);
            }
             }
            startR++;startC++;endR--;endC--;
        }
        return res;
    }
}
