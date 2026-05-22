
//416. Partition Equal Subset Sum


class PartitionEqualSubSetSum{
     public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2!=0){
            return false;
        }
        int k=sum/2;
        int n=nums.length;
        Boolean dp[][]=new Boolean[n][k+1];
        return helper(0,nums,k,dp);
    }

    public boolean helper(int idx,int[] nums,int k,Boolean[][] dp){
        //base case 
        if(k==0){
            return true;
        }
        if(idx==nums.length){
            return false;
        }
          
          if(dp[idx][k]!=null){
            return dp[idx][k];
          }
        boolean notPick=helper(idx+1,nums,k,dp);
        boolean pick=false;

        if(nums[idx]<=k){
            pick=helper(idx+1,nums,k-nums[idx],dp);
        }
        return dp[idx][k]=(notPick || pick);
    }
}