
//115. Distinct Subsequences
//time complexity:O(m*n), where m and n are the length of the two strings
//space complexity:O(m*n), for the dp array

class DistinctSubsequences{
    public int numDistinct(String s, String t) {
         int m=s.length(), n=t.length();

         int[][] dp=new int[m][n];

         for(int[] el:dp){
            Arrays.fill(el,-1);
         }

         return helper(m-1,n-1,s,t,dp);
    }

    public int helper(int i,int j,String s,String t,int[][] dp){
        //base case

           if(j<0){
            return 1;
        }

        if(i<0){
           return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if(s.charAt(i)==t.charAt(j)){
            return dp[i][j]=helper(i-1,j-1,s,t,dp)+helper(i-1,j,s,t,dp);
        }else{
            return dp[i][j]=helper(i-1,j,s,t,dp);
        }
    }
}