//time complexity: O(nlogn)+O(n)=O(nlogn)
//space complexity: O(n)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
     public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        if(n==0){
            return new int[0][0];
        }
        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
       
       List<int[]>temp=new ArrayList<>();
       int[] curr=intervals[0];
        for(int i=1;i<n;i++){
            if(curr[1]>=intervals[i][0]){
               curr[1]=Math.max(curr[1],intervals[i][1]);
            }else{
                temp.add(curr);
                curr=intervals[i];
            }
        }
         temp.add(curr);
        return temp.toArray(new int[temp.size()][]);
    }
}
