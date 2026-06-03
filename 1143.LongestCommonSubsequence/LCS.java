
//1143. Longest Common Subsequence
//time complexity: O(m*n), where m and n are the lengths of the two input strings
//space complexity: O(m*n)


class LCS{
     public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length(),n=text2.length();
        int[][] dp=new int[m][n];

        for(int el[]:dp){
            Arrays.fill(el,-1);
        }

        return helper(m-1,n-1,text1,text2,dp);
    }

    public int helper(int i,int j,String text1,String text2,int[][] dp){
        //base case
        if(i<0 || j<0){
         return 0; 
        }
 
         if(dp[i][j]!=-1){
            return dp[i][j];
         }

        if(text1.charAt(i)==text2.charAt(j)){
            return 1+helper(i-1,j-1,text1,text2,dp);
        }
            int t1=helper(i-1,j,text1,text2,dp);
            int t2=helper(i,j-1,text1,text2,dp);
            
         return dp[i][j]=Math.max(t1,t2);   
    }
}