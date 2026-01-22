// 3507. Min Pair Removal to Sort Array I
//time complexity: O(n^2)
//space complexity: O(n)

import java.util.ArrayList;

public class MinPairRemoval {
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer>temp=new ArrayList<>();

        for(int num:nums){
            temp.add(num);
        }

        int minOperations=0;
        while(!isAscOrder(temp)){
            int minSum=Integer.MAX_VALUE;
            int idx=-1;

            for(int i=0;i<temp.size()-1;i++){
                int sum=temp.get(i)+temp.get(i+1);
                if(sum<minSum){
                   minSum=sum;
                   idx=i;
                }
            }
            temp.set(idx,minSum);
            temp.remove(idx+1);
            minOperations++;
        }
        return minOperations;
    }

    public boolean isAscOrder(ArrayList<Integer>temp){
        for(int i=1;i<temp.size();i++){
            if(temp.get(i-1)>temp.get(i)){
                return false;
            }
        }
        return true;
    }
}
