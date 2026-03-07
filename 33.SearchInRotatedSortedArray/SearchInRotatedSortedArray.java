//33. Search in Rotated Sorted Array
//time complexity: O(log n), where n is the number of elements in the array
//space complexity: O(1), as we are using only a constant amount of extra space

class SearchInRotatedSortedArray{
    public int search(int[] nums, int target) {
        int n=nums.length;
       int start=0,end=n-1;

       while(start<=end){
        int mid=start+(end-start)/2;

        if(nums[mid]==target){
            return mid;
        }

        //left part is sorted
        if(nums[start]<=nums[mid]){
            if(nums[start]<=target && target<=nums[mid]){
                 end=mid-1;
            }else{
                start=mid+1;
            }
        }else{ //right part is sorted
            if(nums[mid+1]<=target && target<=nums[end]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
       }
       return -1;
    }
}