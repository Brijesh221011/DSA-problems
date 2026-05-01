
// 396. Rotate Function
//time complexity: O(n), where n is the length of the input array
//space complexity: O(1)


class RotateFunction{
     public int maxRotateFunction(int[] nums) {
        int n = nums.length;
         int sum=0;
         int func=0;

        for(int i=0;i<n;i++){
            sum+=nums[i];
            func=func+i*nums[i];
        }

        int maxSum=func;
        int currSum=func;
        for(int i=1;i<n;i++){
            currSum=currSum+sum-n*nums[n-i];
            maxSum=Math.max(maxSum,currSum);
        }
        return maxSum;   
    }
}