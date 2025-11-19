//435. Non-Overlapping Intervals
//time complexity: O(nlogn)
//space complexity: O(1)

import java.util.Arrays;
import java.util.Comparator;

class NonOverlapping {
     public int eraseOverlapIntervals(int[][] intervals) {
        int n=intervals.length;
       Arrays.sort(intervals,Comparator.comparingInt(a->a[1]));
        int cnt=0;
         int[] curr=intervals[0];
        for(int i=1;i<n;i++){
            if(curr[1]>intervals[i][0]){
                cnt++;
            }else{
            curr=intervals[i];
            }
        }
        return cnt;
    }
    // public static void main(String[] args){
    //     Solution sol=new Solution();
    //     int[][] intervals={{1,2},{2,3},{3,4},{1,3}};
    //     System.out.println(sol.eraseOverlapIntervals(intervals));
    // }
}