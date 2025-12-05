
public class SplitArray {
    
       public int splitArray(int[] nums, int k) {
        int maxVal=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            maxVal=Math.max(maxVal,nums[i]);
        }

        int low=maxVal,high=sum;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int reqSum=numbSubarray(nums,mid);
            if(reqSum<=k){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int numbSubarray(int []nums,int k){
        int subarray=1,numInSubarray=0;

        for(int i=0;i<nums.length;i++){
            if(numInSubarray+nums[i]<=k){
                numInSubarray+=nums[i];
            }else{
                subarray++;
                numInSubarray=nums[i];
            }
        }
        return subarray;
    }
}
