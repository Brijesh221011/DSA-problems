
//191. Number of 1 Bits
//time complexity: O(log n), where n is the input number, since we are shifting the bits of the number until it becomes 0.
//space complexity: O(1), since we are using only a constant amount of extra space to store the count of 1 bits.

class NumberOf1Bits{
     public int hammingWeight(int n) {
        int cnt=0;

       while(n>1){
        cnt+=(n & 1);
        n=(n>>1);
       }

       if(n==1){
        cnt++;
       }
        return cnt;
    }
}