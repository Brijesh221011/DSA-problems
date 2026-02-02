//239. Sliding Window Maximum
//time complexity: O(n),where n is the length of the input array
//space complexity: O(k),where k is the size of the sliding window


import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        Deque<Integer>dq=new LinkedList<>();
       
        List<Integer>temp=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.removeFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);

            if(i>=k-1){
                temp.add(nums[dq.peekFirst()]);
            }
        }
           int []ans=new int[temp.size()];
        for(int i=0;i<temp.size();i++){
             ans[i]=temp.get(i);
        }
        return ans;
    }
}
