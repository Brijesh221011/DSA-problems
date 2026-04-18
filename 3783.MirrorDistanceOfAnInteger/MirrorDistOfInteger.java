
// 3783. Mirror Distance of an Integer
//time complexity O(logn) where n is the input integer and logn is the number of digits in n
//space complexity O(1) as we are using only a constant amount of space to store the reversed integer and the final result

class MirrorDistOfInteger {
    public int mirrorDistance(int n) {
        int val=reverse(n);
        return Math.abs(n-val);
    }

    public int reverse(int n){
        int rev=0;

        while(n!=0){
            int digit=n%10;
            n/=10;
            rev=rev*10+digit;
        }
        return rev;
    }
}