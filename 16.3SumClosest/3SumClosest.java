
//16. 3Sum Closest
//time complexity: O(n^2), where n is the length of the input array
//space complexity: O(1)


class 3SumClosest{
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
         int closestSum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<n;i++){
            int low=i+1,high=n-1;

            while(low<high){
                int sum=nums[i]+nums[low]+nums[high];

                if(Math.abs(target-sum)<Math.abs(target-closestSum)){
                   closestSum=sum;
                }
                if(sum==target){
                    return sum;
                }else if(sum<target){
                    low++;
                }else{
                    high--;
                }
            }

        }
        return closestSum;
    }
}