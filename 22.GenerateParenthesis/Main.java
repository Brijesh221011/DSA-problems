
import java.util.*;

public class Main {
     public  List<String> generateParenthesis(int n) {
        List<String>res=new ArrayList<>();
        helper("",n,0,0,res);
        return res;
    }

    public void helper(String str,int n,int open,int close,List<String>res){
         if(str.length()==2*n){
            res.add(str);
            return;
         }
          if(open<n){
             helper(str+"(",n,open+1,close,res);
          }
          if(close<open){
           helper(str+")",n,open,close+1,res);
          }
    }
}
