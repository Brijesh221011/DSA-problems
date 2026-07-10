
//26. Remove Duplicates from Sorted Array
//time complexity: O(n), where n is the length of the input array
//space complexity: O(1)

class RemoveDuplicate{
     public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
               
            }
           
        }
        return i+1;
      
       
    }
}