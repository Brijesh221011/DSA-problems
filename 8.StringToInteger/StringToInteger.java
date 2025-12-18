

public class StringToInteger {
     public int myAtoi(String s) {
        s=s.trim();
        if(s.isEmpty()){
            return 0;
        }
        int idx=0;
        int sign=1;
       
       if(s.charAt(idx)=='-'){
        sign=-1;
        idx++;
       }else if(s.charAt(idx)=='+'){
        idx++;
       }
         long res=0;
       
          while(idx<s.length() && Character.isDigit(s.charAt(idx))){
            int digit=s.charAt(idx)-'0';
            res=res*10+digit;

            if(sign==1 && res>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign==-1 && (-res)<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            idx++;
          }
         return sign*(int)res;
    }
}
