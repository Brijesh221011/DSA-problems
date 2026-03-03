// 18.4Sum
//time complexity: O(n^3),where n is the length of the input array.


class 4Sum{
     public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>>res=new ArrayList<>();

        for(int i=0;i<n;i++){
             if(i>0 && nums[i]==nums[i-1]){
                continue;
             }

             for(int j=i+1;j<n;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int start=j+1;
                int end=n-1;

                while(start<end){
                    long sum=(long)nums[i]+nums[j]+nums[start]+nums[end];
                    if(sum==target){
                        List<Integer>temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[start]);
                        temp.add(nums[end]);
                        res.add(temp);
                        start++;
                        end--;
                        while(start<end && nums[start]==nums[start-1]){
                            start++;
                        }
                        while(start<end && nums[end]==nums[end+1]){
                            end--;
                        }
                    }else if(sum<target){
                        start++;
                    }else{
                        end--;
                    }
                }
             }
        }
        return res;
    }
}