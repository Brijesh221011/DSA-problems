

public class MaxConsIII {
     public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int maxLen=0;
         int cntZeroes=0;
         int j=0;
        for(int i=0;i<n;i++){
                if(nums[i]==0){
                    cntZeroes++;
                }
                while(cntZeroes>k){
                    if(nums[j]==0){
                        cntZeroes--;
                        
                    }
                     j++;
                }

                if(cntZeroes<=k){
                    maxLen=Math.max(maxLen,i-j+1);
                }
        }
        return maxLen;
    }

}
