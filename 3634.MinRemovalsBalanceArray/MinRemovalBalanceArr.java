// 3634. Minimum Removals to Balance the Array
//time complexity O(nlogn) , where n is the number of elements in the input array 
// space complexity O(1)


import java.util.Arrays;

public class MinRemovalBalanceArr {
     public int minRemoval(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int i=0,cnt=0;

        for(int j=0;j<n;j++){
            while(nums[j]>(long)nums[i]*k){
                i++;
            }
            cnt=Math.max(cnt,j-i+1);
        }
        return n-cnt;
    }
}
