// 673. Number of Longest Increasing Subsequence
//time complexity O(n^2), where n is the length of the input array
//space complexity O(n) for the dp and cnt arrays

class NoOfIncreasingSubsequence{
     public int findNumberOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
         Arrays.fill(dp,1);
        int cnt[]=new int[n];
         Arrays.fill(cnt,1);

         int maxLen=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i] && 1+dp[j]>dp[i]){
                    dp[i]=1+dp[j];
                    cnt[i]=cnt[j];
                }else if(nums[j]<nums[i] && 1+dp[j]==dp[i]){
                    cnt[i]+=cnt[j];
                }
            }
            maxLen=Math.max(maxLen,dp[i]);
        }

       int maxi=0;

       for(int i=0;i<n;i++){
        if(dp[i]==maxLen){
        maxi+=cnt[i];
        }
       }
       return maxi;
    }
}