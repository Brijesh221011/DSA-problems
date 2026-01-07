//40. Combination Sum II
//time complexity: O(2^t*k) t is target and k is average length of each combination
//space complexity: O(k*x) x is number of combinations

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
     
     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
         helper(0,candidates,target,temp,res);

         return res;
    }

    public void helper(int idx,int[] candidates,int target,List<Integer>temp,List<List<Integer>>res){
        
        //base case
            if(target==0){
               res.add(new ArrayList<>(temp));
                 return;
              }

              for(int i=idx;i<candidates.length;i++){
                if(i>idx && candidates[i]==candidates[i-1]){
                    continue;
                }
                if(target<candidates[i]){
                    break;
                }
                 temp.add(candidates[i]);
                 helper(i+1,candidates,target-candidates[i],temp,res);
                temp.remove(temp.size()-1);
              }
       
    }
}
