//131. Palindrome Partitioning
//Time Complexity: O(N*2^N) where N is the length of the string. In the worst case, we may have to explore all possible partitions of the string, which can be exponential in nature. For each partition, we may need to check if the substring is a palindrome, which takes O(N) time.
//Space Complexity: O(N) for the recursion stack and the temporary list used to store the

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
      public List<List<String>> partition(String s) {
        List<List<String>>res=new ArrayList<>();
        List<String>temp=new ArrayList<>();
        rec(0,s,temp,res);
        return res;
    }

    public void rec(int idx,String s,List<String>temp,List<List<String>>res){
        if(idx==s.length()){
          res.add(new ArrayList<>(temp));
        }
         for(int i=idx;i<s.length();i++){
            if(isPalindrome(s,idx,i)){
                temp.add(s.substring(idx,i+1));
                rec(i+1,s,temp,res);
                temp.remove(temp.size()-1);
            }
         }
    }

    //check string is palindrome
    public boolean isPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }

}
