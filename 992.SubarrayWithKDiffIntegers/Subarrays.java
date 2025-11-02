import java.util.HashMap;
public class Subarrays {

    public int subarraysWithKDistinct(int[] nums, int k) {
      return  subarrayLessOrEqualK(nums,k)-subarrayLessOrEqualK(nums,k-1);
    }

    public int subarrayLessOrEqualK(int nums[],int k){
       int n=nums.length;
        int cnt=0;
        int i=0;
         HashMap<Integer,Integer>hm=new HashMap<>();

            for(int j=0;j<n;j++){
                hm.put(nums[j],hm.getOrDefault(nums[j],0)+1);

                while(hm.size()>k){
                   hm.put(nums[i],hm.get(nums[i])-1);
                   if(hm.get(nums[i])==0){
                    hm.remove(nums[i]);
                   }
                   i++;
                }
                cnt+=(j-i+1);
            }
        
        return cnt;
    }
}
