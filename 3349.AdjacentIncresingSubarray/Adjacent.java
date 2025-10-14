//time complexity: O(n*k)
//space complexity: O(1)

import java.util.List;

class Adjacent{

    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n=nums.size();
        for(int i=0;i<=n-2*k;i++){
            boolean firstSubArr=isStrictlyInc(nums,i,i+k-1);
            boolean secondSubArr=isStrictlyInc(nums,i+k,i+2*k-1);

            if(firstSubArr && secondSubArr){
                return true;
            }
        }
        return false;
    }
    public boolean isStrictlyInc(List<Integer>nums,int left,int right){
        for(int i=left;i<right;i++){
            if(nums.get(i)>=nums.get(i+1)){
                return false;
            }
        }
        return true;
    }
}