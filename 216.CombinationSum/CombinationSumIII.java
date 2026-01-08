//216. Combination Sum III
//time complexity: O(2^9*k) k is average length of each combination 
//space complexity: O(k*x) x is number of combinations

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
     public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr=new int[9];

         for(int i=0;i<9;i++){
                arr[i]=i+1;
         }
         List<List<Integer>>res=new ArrayList<>();
         List<Integer>temp=new ArrayList<>();
         helper(0,k,n,arr,temp,res);
         return res;
    }

     static void helper(int idx,int k,int n,int []arr,List<Integer>temp,List<List<Integer>>ans){
        //base case
       
        if(temp.size()==k){
            if(n==0){
           ans.add(new ArrayList<>(temp));
            }
            return;    
        }
        if(idx==arr.length ||n<0){
            return;
        }
           temp.add(arr[idx]);  
         helper(idx+1,k,n-arr[idx],arr,temp,ans);
         temp.remove(temp.size()-1);
          helper(idx+1,k,n,arr,temp,ans);
    }
}
