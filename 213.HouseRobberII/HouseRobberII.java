//time complexity: O(n)
// space complexity: O(n) for memoization

import java.util.Arrays;

public class HouseRobberII {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        if(n==1){
            return nums[0];
        }
        if(n==2){
            return Math.max(nums[0],nums[1]);
        }
        int[] dp1=new int[n];
        Arrays.fill(dp1,-1);
       int way1= memo(n-2,0,nums,dp1); 

       int[] dp2=new int[n];
        Arrays.fill(dp2,-1);
       int way2= memo(n-1,1,nums,dp2);
        
        return Math.max(way1,way2);
    }

    public int memo(int idx,int start,int[] nums,int[] dp){
        if(idx<start){
            return 0;
        }
        if(idx==start){
            return nums[start];
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int pick=nums[idx]+memo(idx-2,start,nums,dp);
        int notPick=memo(idx-1,start,nums,dp);

        return dp[idx]=Math.max(pick,notPick);
    }
}
