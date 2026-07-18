
//1979. Find GCD of Array
//time complexity: O(n), since we traverse the array once to find the minimum and maximum values.
//space complexity: O(1), since we use a constant amount of space.

class FindGCD{
    public int findGCD(int[] nums) {
        int minV=Integer.MAX_VALUE;
        int maxV=Integer.MIN_VALUE;

        for(int num:nums){
            minV=Math.min(minV,num);
            maxV=Math.max(maxV,num);
        }

        int res=gcd(maxV,minV);
        return res;
    }

    public int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}