
//3658. GCD of Odd and Even Sums
//time complexity: O(n), since we iterate through the numbers from 1 to 2*n to calculate the sums of odd and even numbers
//space complexity: O(1), since we use a constant amount of space for the sums

class GCDOfOddEvenSums{
     public int gcdOfOddEvenSums(int n) {
        if(n==1){
            return 1;
        }
        int sumOdd=0;
        int sumEven=0;

        for(int i=1;i<=2*n;i++){
             if(i%2==0){
                sumEven+=i;
             }else{
                sumOdd+=i;
             }
        }
        return findGCD(sumOdd,sumEven);
    }

    public int findGCD(int a,int b){
        return (b==0)?a:b%a;
    }
}