//1047. Remove All Adjacent Duplicates In String
//time complexity: O(n), where n is the length of the string s
//space complexity: O(n)

import java.util.Stack;

public class AdjacentDuplicate {
     public String removeDuplicates(String s) {
         StringBuilder sb=new StringBuilder();
         Stack<Character>st=new Stack<>();

         for(char ch:s.toCharArray()){
            if(!st.isEmpty() && st.peek()==ch){
                st.pop();
            }else{
                st.push(ch);
            }
         }

         if(st.isEmpty()){
            return "";
         }

         while(!st.isEmpty()){
            sb.append(st.pop());
         }
         return sb.reverse().toString();
    }
}
