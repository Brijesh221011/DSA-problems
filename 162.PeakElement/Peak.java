//162. Find Peak Element
// time complexity: O(log n)
// space complexity: O(1)

public class Peak {
    
     public int findPeakElement(int[] nums) {
        int n=nums.length;
        int start=0,end=n-1;

        while(start<end){
            int mid=(start+end)/2;
            if(nums[mid]>nums[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
}
