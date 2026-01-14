//139. Word Break
//time complexity: O(n^2)
//space complexity: O(n)

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    
      public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();

        Boolean[] dp=new Boolean[n];
        Set<String>set=new HashSet<>();
   
        for(String str:wordDict){
           set.add(str);
        }
        return rec(0,s,set,dp);
    }

    public boolean rec(int idx,String s,Set<String>set,Boolean[] dp){
        //base

        if(idx==s.length()){
            return true;
        }

        if(dp[idx]!=null){
            return dp[idx];
        }
        for(int i=idx;i<s.length();i++){
            String subStr=s.substring(idx,i+1);
            if(set.contains(subStr)){
                if(rec(i+1,s,set,dp)){
                  return dp[idx]=true;
                }
            }
            
        }
        return dp[idx]=false;
    }
}
