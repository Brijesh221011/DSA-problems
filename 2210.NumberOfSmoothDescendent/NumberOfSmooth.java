
public class NumberOfSmooth {
    public long getDescentPeriods(int[] prices) {
        int n=prices.length;
        long res=0;
        long currL=1;
        for(int i=0;i<n;i++){
           if(i==0 || prices[i]!=prices[i-1]-1){
               currL=1;
           }else{
              currL=currL+1;
           }
           res=res+currL;
        }
        return res;
    }
}
