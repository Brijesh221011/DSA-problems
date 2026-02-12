// 45. Jump Game II
//time complexity: O(n),where n is the length of the input array nums
//space complexity: O(1)

class JumpGameII {
    public int jump(int[] nums) {
        int n=nums.length;
        int maxReach=nums[0];
        int steps=nums[0];
        int jumps=1;
          
          for(int i=1;i<nums.length;i++){
            if(i==n-1){
                return jumps;
            }
            maxReach=Math.max(maxReach,nums[i]+i);
            steps--;

            if(steps==0){
                jumps++;
                if(i>=maxReach){
                    return -1;
                }
                steps=maxReach-i;
            }
          }
          return 0;
    }
}