//1356. Sort Integers by The Number of 1 Bits
//time complexity: O(n log n) where n is the length of the input array
//space complexity: O(n) where n is the length of the input array

import java.util.*;

class SortIntegersByBitCnt{
    public int[] sortByBits(int[] arr) {
        int n=arr.length;
         PriorityQueue<Integer>pq=new PriorityQueue<>(
        (x, y) -> {
                int bitCompare = Integer.bitCount(x) - Integer.bitCount(y);
                if (bitCompare == 0){
                    return x - y;
                }
                return bitCompare;
            }
        );
        
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }

        int[] ans=new int[n];
        int idx=0;

        while(!pq.isEmpty()){
            ans[idx++]=pq.remove();
        }
        return ans;
    }
}