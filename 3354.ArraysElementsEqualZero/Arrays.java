
public class Arrays {
    public int countValidSelections(int[] nums) {
        int n=nums.length;
        int totSelections=0;
        int totSum=0;

        for(int i=0;i<n;i++){
            totSum+=nums[i];
        }

        int leftSm=0;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                int rightSm=totSum-leftSm;
                if(leftSm==rightSm){
                    totSelections+=2;
                }else if(Math.abs(leftSm-rightSm)==1){
                    totSelections+=1;
                }
            }
            leftSm+=nums[i];
        }
        return totSelections;
    }
}
