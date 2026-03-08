//153. Minimum in Rotated Sorted Array
//time complexity: O(log n), where n is the number of elements in the array
//space complexity: O(1)

class MinRotatedArray{
    public int findMin(int[] nums) {
        int n=nums.length;
        int minVal=Integer.MAX_VALUE;
        int start=0,end=n-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(nums[start]<=nums[mid]){
               minVal=Math.min(minVal,nums[start]);
                start=mid+1;
            }else{
                 minVal=Math.min(minVal,nums[mid]);
                end=mid-1;
            }
        }
        return minVal;
    }
}