
//1547. Minimum Cost to Cut a Stick
//time complexity: O(n^3), where n is the number of cuts
//space complexity: O(n^2) for dp array 

public class MinCostToCutStick{
    public int minCost(int n, int[] cuts) {
        int[] arr = new int[cuts.length + 2];
        arr[0] = 0;
        arr[cuts.length + 1] = n;

        for (int i = 0; i < cuts.length; i++) {
            arr[i + 1] = cuts[i];
        }

        Arrays.sort(arr);
        int c=arr.length-2;
        int[][] dp=new int[c+2][c+2];

        for(int[] el:dp){
            Arrays.fill(el,-1);
        }
        return helper(1, c, arr,dp);
    }

    public int helper(int i, int j, int[] cuts,int[][] dp) {
        //base case
        if (i > j) {
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int minCost = Integer.MAX_VALUE;
        for (int k = i; k <= j; k++) {
            int cost = cuts[j + 1] - cuts[i - 1] + helper(i, k - 1, cuts,dp) + helper(k + 1, j, cuts,dp);
            minCost = Math.min(minCost, cost);
        }
        return dp[i][j]=minCost;
    }
}