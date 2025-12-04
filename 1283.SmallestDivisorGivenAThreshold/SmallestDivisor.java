//time complexity: O(n log m) where n is the length of nums and m is the maximum value in nums
//space complexity: O(1)

public class SmallestDivisor {
      
     public int smallestDivisor(int[] nums, int threshold) {
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            maxVal = Math.max(maxVal, nums[i]);
        }
        
        int low=1,high=maxVal;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(sumDivision(nums,mid)<=threshold){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

    public int sumDivision(int nums[],int d){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=(int)Math.ceil((double)nums[i]/d);
        }
        return sum;
    }
}
