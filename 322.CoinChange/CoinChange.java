import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp=new int[n][amount+1];

        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        int res= memo(n - 1, coins, amount,dp);
        return res==(int)1e9?-1:res;
    }

    public int memo(int idx, int coins[], int amt,int[][] dp) {
        if (idx == 0) {
            if (amt % coins[0] == 0){
                return amt / coins[0];
            }
            return (int)1e9;
        }
      

        if(dp[idx][amt]!=-1){
            return dp[idx][amt];
        }
        int notTake = memo(idx - 1, coins, amt,dp);
        int take = (int)1e9;
        if (coins[idx] <= amt) {
            take = 1 + memo(idx , coins, amt - coins[idx],dp);
        }
        return dp[idx][amt]=Math.min(take,notTake);
    }
}
