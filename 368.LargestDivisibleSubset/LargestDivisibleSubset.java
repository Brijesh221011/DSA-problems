
// 368. Largest Divisible Subset
//time complexity: O(n^2), where n is the length of the input array
//space complexity: O(n) for the dp and hash arrays 

class LargestDiviSibleSubset{
     public List<Integer> largestDivisibleSubset(int[] nums) {
        int n=nums.length;
         Arrays.sort(nums);
         
        int[] hash=new int[n];
        
        int[] dp=new int[n];
        Arrays.fill(dp,1);

        int maxLen=0;
        int lastIdx=0;

        for(int i=0;i<n;i++){
            hash[i]=i;
            for(int prev=0;prev<i;prev++){
               if(nums[i]%nums[prev]==0 && 1+dp[prev]>dp[i]){
                 dp[i]=1+dp[prev];
                 hash[i]=prev;
               }
            }

            if(dp[i]>maxLen){
                maxLen=dp[i];
                lastIdx=i;
            }
        }

        ArrayList<Integer>res=new ArrayList<>();

        res.add(nums[lastIdx]);

        while(hash[lastIdx]!=lastIdx){
            lastIdx=hash[lastIdx];
            res.add(nums[lastIdx]);
        }
       
        return res;
    }
}