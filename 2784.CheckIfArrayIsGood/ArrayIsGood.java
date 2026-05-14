
// Problem: 2784. Check if Array Is Good
//time complexity: O(n), where n is the length of the input array nums. 
//space complexity: O(n)

class ArrayIsGood{
     public boolean isGood(int[] nums) {
      int n=nums.length-1;
      //check if length is correct
      if(nums.length!=n+1){
        return false;
      }
      Map<Integer,Integer>freq=new HashMap<>();

      for(int num:nums){
        freq.put(num,freq.getOrDefault(num,0)+1);
      }
      // Check if all numbers from 1 to n-1 appear exactly once
      for(int i=1;i<n;i++){
        if(freq.getOrDefault(i,0)!=1){
            return false;
        }
      }
      // Check if n appears exactly twice
      if(freq.getOrDefault(n,0)!=2){
        return false;
      }
      return true;
    }
}