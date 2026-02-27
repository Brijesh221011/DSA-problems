//128. Longest Consecutive Sequence
//time complexity: O(nlogn) due to sorting the input array
//space complexity: O(1) since we are using only a constant amount of extra space

public class LongestConsecutiveSequence{
      public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
       
        Arrays.sort(nums);
           int cnt=1,maxCnt=1;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }else if(nums[i]+1==nums[i+1]){
                cnt++;
            }else{
                cnt=1;
            }
            maxCnt=Math.max(maxCnt,cnt);
        }
        
        
        return maxCnt;
    }
}