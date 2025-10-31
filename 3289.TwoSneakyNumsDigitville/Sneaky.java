import java.util.ArrayList;
import java.util.Arrays;

public class Sneaky {
    public int[] getSneakyNumbers(int[] nums) {
        ArrayList<Integer>temp=new ArrayList<>();
         Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
                if(nums[i-1]==nums[i]){
                    temp.add(nums[i-1]);
                   
                }
        }
        int []res=new int[temp.size()];

        for(int i=0;i<temp.size();i++){
            res[i]=temp.get(i);
        }
        return res;
    }
}
