import java.util.*;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        helper(0,nums,temp,res);
        return res;
    }

    public void helper(int idx,int[] nums,List<Integer>temp,List<List<Integer>>res){
        //base case
        if(idx==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        helper(idx+1,nums,temp,res);
        temp.add(nums[idx]);
        helper(idx+1,nums,temp,res);
        temp.remove(temp.size()-1);
        
    }
}
