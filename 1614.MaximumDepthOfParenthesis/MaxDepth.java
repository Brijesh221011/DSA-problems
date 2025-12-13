

public class MaxDepth {
    public int maxDepth(String s) {
       int openCnt=0;
       int maxDepth=0;

       for(char ch:s.toCharArray()){
        if(ch=='('){
            openCnt++;
        }else if(ch==')'){
            openCnt--;
        }
        maxDepth=Math.max(maxDepth,openCnt);
       } 
       return maxDepth;
    }
}
