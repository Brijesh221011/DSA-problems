//300. Longest Increasing Subsequence
//time complexity: O(n^2)
//space complexity: O(n^2) + O(n) for recursion stack

import java.util.Arrays;
public class LIS {
     public int lengthOfLIS(int[] nums) {
        int n=nums.length;
         int[][] dp=new int[n][n+1];
          for(int []row:dp){
            Arrays.fill(row,-1);
          }
          return memo(0,-1,nums,dp);
    }
    
     public static int memo(int idx,int prevIdx,int[] nums,int[][] dp){
        if(idx==nums.length){
            return 0;
        }
        if(dp[idx][prevIdx+1]!=-1){
            return dp[idx][prevIdx+1];
        }
        int notPick=memo(idx+1,prevIdx,nums,dp);
         int pick=0;
        if(prevIdx==-1 || nums[idx]>nums[prevIdx]){
             pick=1+memo(idx+1,idx,nums,dp);
        }
        return dp[idx][prevIdx+1]=Math.max(notPick,pick);
     }
}
