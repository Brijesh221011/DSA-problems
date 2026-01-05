

public class CountGoodNums {
     long MOD=1000000007;
    public int countGoodNumbers(long n) {
        long evenLen=(n+1)/2;
        long oddLen=n/2;
        return (int) (helper(5,evenLen)*helper(4,oddLen)%MOD);
    }
     public long helper(long x,long n){
        if(n==0){
            return 1;
        }
        long half=helper(x,n/2);
        if(n%2==0){
            return (half*half)%MOD;
        }else{
            return (half*half*x)%MOD;
        }
     }
}
