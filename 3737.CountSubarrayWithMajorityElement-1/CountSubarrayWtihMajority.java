
//3737. Count Subarray With Majority Element
//time complexity: O(n^2), where n is the number of elements in the nums array
//space complexity: O(n)


class CountSubarrayWithMajority{
     public int countMajoritySubarrays(int[] nums, int target) {
         int n=nums.length;
        int res=0;
        for(int i=0;i<n;i++){
            Map<Integer,Integer>hm=new HashMap<>();
            for(int j=i;j<n;j++){
                hm.put(nums[j],hm.getOrDefault(nums[j],0)+1);

                if(hm.containsKey(target) && hm.get(target)>(j-i+1)/2){
                    res++;
                }
            }
           
        }
        return res;
    }
}