
//516. Longest Palindromic Subsequence
//time complexity: O(n^2), where n is the length of the input string
//space complexity: O(n^2), where n is the length of the input string, due to the dp array used for memoization

class LPS{
     public int longestPalindromeSubseq(String s) {
        int n=s.length();
         int[][] dp=new int[n][n];
         
         for(int []el:dp){
            Arrays.fill(el,-1);
         }
        return helper(0,n-1,s,dp);
    }

    public int helper(int i,int j,String s,int[][] dp){
        //base case
        if(i>j){
            return 0;
        }
         if(i==j){
            return 1;
         }
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if(s.charAt(i)==s.charAt(j)){
            return dp[i][j]=2+helper(i+1,j-1,s,dp);
        }

        return dp[i][j]=Math.max(helper(i+1,j,s,dp),helper(i,j-1,s,dp));
    }
}