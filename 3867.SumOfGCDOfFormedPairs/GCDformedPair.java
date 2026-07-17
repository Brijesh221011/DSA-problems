
//3867. Sum of GCD of Formed Pairs
//time complexity: O(nlogn), since we sort the prefix GCD array .
//space complexity: O(n), since we use an array to store the prefix GCD values.

class GCDformedPair{
     public long gcdSum(int[] nums) {
        int n=nums.length;
        int mx=0;
        long[] prefGcd=new long[n];
        for(int i=0;i<n;i++){
            mx=Math.max(mx,nums[i]);
            prefGcd[i]=findGCD(nums[i],mx);
        }
        Arrays.sort(prefGcd);

        long sum=0;

        int i=0,j=n-1;

        while(i<j){
            sum+=findGCD(prefGcd[i],prefGcd[j]);
            i++;
            j--;
        }
        return sum;
    }


    public long findGCD(long a,long b){
        if(b==0){
            return a;
        }

        return findGCD(b,a%b);
    }
}