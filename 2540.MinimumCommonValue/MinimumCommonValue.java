
// 2540. Find the Minimum Common Value
//time complexity: O(n+m), where n and m are the lengths of the input arrays nums1 and nums2, respectively.
//space complexity: O(1)

class MinimumCommonValue{
     public int getCommon(int[] nums1, int[] nums2) {
        int i=0,j=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                return nums1[i];
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        return -1;
    }
}