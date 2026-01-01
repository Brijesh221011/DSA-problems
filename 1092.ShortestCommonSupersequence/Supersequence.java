//time complexity: O(n*m)  space complexity: O(n*m)

import java.util.Arrays;

public class Supersequence {
      public String shortestCommonSupersequence(String str1, String str2) {
        int n=str1.length();
        int m=str2.length();

        int[][] dp=new int[n][m];

		 for(int[] arr:dp){
			 Arrays.fill(arr,-1);
		 }
	      lcs(n-1,m-1,str1,str2,dp);

          StringBuilder sb=new StringBuilder();

          int i=n-1,j=m-1;

          while(i>=0 && j>=0){
              if(str1.charAt(i)==str2.charAt(j)){
                 sb.append(str1.charAt(i));
                 i--;j--;
              }else if(i>0 && (j==0 ||dp[i-1][j]>dp[i][j-1])){
                   sb.append(str1.charAt(i));
                   i--;
              }else{
                 sb.append(str2.charAt(j));
                   j--; 
              }
          }
          while(i >= 0){
             sb.append(str1.charAt(i));
             i--;
          } 
          while(j >= 0){
            sb.append(str2.charAt(j));
            j--;
          } 
          return sb.reverse().toString();
    }
     public  int lcs(int i,int j,String s,String t,int[][] dp){
		//base case
         if(i<0 || j<0){
			 return 0;
		 }

        if(dp[i][j]!=-1){
			return dp[i][j];
		}
		if(s.charAt(i)==t.charAt(j)){
			return dp[i][j]=1+lcs(i-1,j-1,s,t,dp);
		}

		return dp[i][j]=Math.max(lcs(i-1,j,s,t,dp),lcs(i,j-1,s,t,dp));
	}
}
