//Problem: 3379. Transformed Array
//time complexity: O(n),where n is the length of the input array
//space complexity: O(n),where n is the length of the input array

public class TransformedArray {

    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                int idx=nums[i];
                res[i]=nums[(i+idx)%n];
            }else if(nums[i]<0){
                int idx=Math.abs(nums[i])%n;
                    res[i]=nums[(n+i-idx)%n];   
            }else{
                res[i]=nums[i];
            }
        }
        return res;
    }
    
}
