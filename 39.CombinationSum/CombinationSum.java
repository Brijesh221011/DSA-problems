//39. Combination Sum
//time complexity: O(2^t*k) t is target and k is average length of each combination
//space complexity: O(k*x) x is number of combinations

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
         helper(0,candidates,target,temp,res);
         return res;
    }

    public void helper(int idx,int[] candidates,int target,List<Integer>temp,List<List<Integer>>res){
        //base case
       
        if(idx==candidates.length){
              if(target==0){
               res.add(new ArrayList<>(temp));
              }
             return;
        }

        if(candidates[idx]<=target){
        temp.add(candidates[idx]);
        helper(idx,candidates,target-candidates[idx],temp,res);
        temp.remove(temp.size()-1);
        }
        helper(idx+1,candidates,target,temp,res);
       
    }
}
