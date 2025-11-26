//leetcode 31. Next Permutation
//Time Complexity: O(n)
//Space Complexity: O(1)

public class NextPermutaion {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
         int idx=-1;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                idx=i-1;
                break;
            }
        }
         
         if(idx==-1){
           reverse(nums,0,n-1);
           return;
         }

         for(int i=n-1;i>idx;i--){
            if(nums[i]>nums[idx]){
                swap(nums,i,idx);
                 break;
            }
         }
         reverse(nums,idx+1,n-1);

    }

    public void  swap(int nums[],int start,int end){
           int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
    }

    public void reverse(int nums[],int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;end--;
        }
    }
}
