// time complexity: O(m+n) , space complexity: O(n)

import java.util.*;

public class NextGreater {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        Map<Integer,Integer>hm=new HashMap<>();
        Stack<Integer>st=new Stack<>();

        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && nums2[i]>=st.peek()){
                st.pop();
            }

            hm.put(nums2[i],st.isEmpty()?-1:st.peek());
            st.push(nums2[i]);
        }
         int[] ans=new int[n];

         for(int i=0;i<n;i++){
            ans[i]=hm.get(nums1[i]);
         }
         return ans;
    }
}
