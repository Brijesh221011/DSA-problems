
// 309. Buy and Sell Stock with Cooldown
//time complexity: O(n), where n is the length of the input array
//space complexity: O(n) for the dp array

class BuyAndSellWithCooldown{
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] dp=new int[n][2];

            for(int [] el:dp){
                Arrays.fill(el,-1);
          }
        return helper(0,0,prices,dp);
    }

    public int helper(int idx,int buy,int[] prices,int[][] dp){
        //base case
        if(idx>=prices.length){
            return 0;
        }

        if(dp[idx][buy]!=-1){
            return dp[idx][buy];
        }
        int maxProfit=0;
        if(buy==0){
            int buyItem=Math.max(helper(idx+1,0,prices,dp),-prices[idx]+helper(idx+1,1,prices,dp));
            maxProfit=Math.max(maxProfit,buyItem);
        }else{
            int sellItem=Math.max(helper(idx+1,1,prices,dp),prices[idx]+helper(idx+2,0,prices,dp));// buy->sell->cooldown->buy->sell
            maxProfit=Math.max(maxProfit,sellItem);
        }
        return dp[idx][buy]=maxProfit;
    }
}