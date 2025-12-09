
public class OutermostParenthesis {
        public String removeOuterParentheses(String s) {
      int cnt=0;
    StringBuilder sb=new StringBuilder();
      for(char ch:s.toCharArray()){
        if(ch=='('){
            cnt++;
            if(cnt>1){
              sb.append(ch);
            }
        }else{
            cnt--;
            if(cnt>0){
                sb.append(ch);
            }
        }
      } 
     return sb.toString();
    }
} 
