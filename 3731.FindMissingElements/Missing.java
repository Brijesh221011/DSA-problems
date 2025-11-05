import java.util.*;
import java.util.Arrays;
public class Missing {
    public ArrayList<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
       HashSet<Integer>set=new HashSet<>();

       for(int num:nums){
        set.add(num);
       } 
       int si=nums[0],ei=nums[nums.length-1];
       ArrayList<Integer>res=new ArrayList<>();
       for(int i=si;i<ei;i++){
        if(!set.contains(i)){
            res.add(i);
        }
       }
       return res;
    }
}
