

public class SortColors {
    
    public void sortColors(int[] nums) {
        int n=nums.length;
        int cntZeroes=0,cntOnes=0;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                cntZeroes++;
            }else if(nums[i]==1){
                cntOnes++;
            }
        }

        for(int i=0;i<cntZeroes;i++){
            nums[i]=0;
        }

        for(int i=cntZeroes;i<cntZeroes+cntOnes;i++){
            nums[i]=1;
        }

          for(int i=cntOnes+cntZeroes;i<n;i++){
            nums[i]=2;
        }
    }
}
