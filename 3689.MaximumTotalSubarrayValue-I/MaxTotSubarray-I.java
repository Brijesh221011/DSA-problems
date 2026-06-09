
// 3689. Maximum Total Subarray Value I
//time complexity: O(n), where n is the length of the input array
//space complexity: O(1) 

class MaxTotSubarray-I{
     public long maxTotalValue(int[] nums, int k) {
        long maxValue=Long.MIN_VALUE;
        long minValue=Long.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            minValue=Math.min(minValue,nums[i]);
            maxValue=Math.max(maxValue,nums[i]);
        }
        return (maxValue-minValue)*k;
    }
}