import java.util.Arrays;

public class CoinChangeII {
     public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp=new int[n][amount+1];

        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return memo(n - 1, coins, amount,dp);
    }
    public int memo(int idx, int coins[], int amt,int[][] dp) {
        if (idx == 0) {
            if (amt % coins[0] == 0){
                return 1;
            }
            return 0;
        }
      

        if(dp[idx][amt]!=-1){
            return dp[idx][amt];
        }
        int notTake = memo(idx - 1, coins, amt,dp);
        int take = 0;
        if (coins[idx] <= amt) {
            take = memo(idx , coins, amt - coins[idx],dp);
        }
        return dp[idx][amt]=take+notTake;
    }
}
