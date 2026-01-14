// 1209.RemoveAllAdjDuplicateII;
//time complexity O(n), where n is the length of the string s
//space complexity O(n)

import java.util.Stack;

public class RemoveAllAdjDuplicateII {
    
     class Pair{
        char c;
        int cnt;

        Pair(char c,int cnt){
            this.c=c;
            this.cnt=cnt;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Pair>st=new Stack<>();
       
        for(char ch:s.toCharArray()){
            if(!st.isEmpty() && st.peek().c==ch ){
                st.peek().cnt++;
               
                 if(st.peek().cnt==k){
                    st.pop();
                }
            }else{
                st.push(new Pair(ch,1));
           } 
        }
        
         StringBuilder sb=new StringBuilder();

         for(Pair p:st){
            for(int i=0;i<p.cnt;i++){
                sb.append(p.c);
            }
         }
        return sb.toString();
    }
}
