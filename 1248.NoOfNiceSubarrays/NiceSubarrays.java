//time complexity: O(n)
//space complexity: O(n)

import java.util.HashMap;

public class NiceSubarrays {
      public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }else{
                nums[i]=1;
            }
        }
        HashMap<Integer,Integer>hm=new HashMap<>();
        int sum=0;
        hm.put(0,1);
        int cnt=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(hm.containsKey(sum-k)){
               cnt+=hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}
