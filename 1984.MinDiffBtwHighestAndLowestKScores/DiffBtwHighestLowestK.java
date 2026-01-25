//Problem 1984. Minimum Difference Between Highest and Lowest of K Scores
//time complexity: O(nlogn),where n is the length of the input array
//space complexity: O(1)

import java.util.Arrays;

public class DiffBtwHighestLowestK {
     public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 1) {
            return 0;
        }
        Arrays.sort(nums);
        int minDiff=Integer.MAX_VALUE;
         int i=0;
        for (int j = 0; j < n ; j++) {
            if(j-i+1==k){
            minDiff=Math.min(minDiff,nums[j]-nums[i]);
            i++;
            }
        }

        return minDiff;
    }
}
