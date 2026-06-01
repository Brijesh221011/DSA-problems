
// 2144. Minimum Cost of Buying Candies With Discount
// time complexity: O(nlogn), where n is the length of the input array
// space complexity: O(n), where n is the length of the input array

class MinCostCandies{
    public int minimumCost(int[] cost) {
        int n=cost.length;
        
        Arrays.sort(cost);

        int []temp=new int[n];
         
        for(int i=n-1;i>=0;i--){
            temp[n-i-1]=cost[i];
        }
        
        int ans=0;

        for(int i=0;i<n;i++){
            if((i+1)%3!=0){
                ans+=temp[i];
            }
        }
        return ans;
    }
}