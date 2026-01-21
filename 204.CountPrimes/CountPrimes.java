//Problem 204. Count Primes
//time complexity: O(n log log n)
//space complexity: O(n)


public class CountPrimes {

    public int countPrimes(int n) {
        int []prime=new int[n+1];

        for(int i=2;i<n;i++){
            prime[i]=1;
        }

        for(int i=2;i<n;i++){
            if(prime[i]==1){
                for(int j=2*i;j<=n;j+=i){
                    prime[j]=0;
                }
            }
        }

        int cnt=0;

        for(int i=2;i<n;i++){
            if(prime[i]==1){
                cnt++;
            }
        }
        return cnt;
    }
}
