

public class DivideArrayWithMinCost {
    public int minimumCost(int[] nums) {
        int n=nums.length;
        int sum=nums[0];
        int firMin=Integer.MAX_VALUE;
        int secMin=Integer.MAX_VALUE;

        for(int i=1;i<n;i++){
            if(nums[i]<=firMin){
                secMin=firMin;
                firMin=nums[i];
            }else if(nums[i] > firMin && nums[i] < secMin){
                secMin=nums[i];
            }
        }
        return sum+firMin+secMin;
    }
}
