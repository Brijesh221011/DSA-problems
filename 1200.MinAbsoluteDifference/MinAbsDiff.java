//Problem 1200. Minimum Absolute Difference
//time complexity: O(nlogn),where n is the length of the input array
//space complexity: O(1)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinAbsDiff {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        List<List<Integer>>res=new ArrayList<>();

        int minAbsDiff=Integer.MAX_VALUE;

        for(int i=1;i<n;i++){
            minAbsDiff=Math.min(minAbsDiff,arr[i]-arr[i-1]);
        }

        for(int i=1;i<n;i++){
            if(arr[i]-arr[i-1]==minAbsDiff){
                res.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return res;
    }
}
