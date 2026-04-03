
// Problem: 1679. Max Number of K-Sum Pairs

// Time Complexity: O(nlogn) due to sorting the array
// Space Complexity: O(1) as we are using only a constant amount of extra space

class MaxNumKSum{
    public int maxOperations(int[] nums, int k) {
        int count=0;
        int start=0;
        int end=nums.length-1;
      Arrays.sort(nums);
        while(start<end){
            int sum=nums[start]+nums[end];
            if(sum==k){
                count++;
                start++;
                end--;
            }else if(sum<k){
                start++;
            }else{
                end--;
            }
        }
        return count;
    }
}