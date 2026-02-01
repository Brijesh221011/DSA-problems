
//Problem 2104. Sum of Subarray Ranges
//time complexity: O(n),where n is the length of the input array
//space complexity: O(n),for using stacks and extra arrays

import java.util.Stack;

class SumOfSubarrayRanges {

    public long subArrayRanges(int[] nums) {
       return subarrayMax(nums)-subarrayMins(nums);
    }

    //find next smaller element
    public int[] findNSE(int[] nums){
         int n=nums.length;
         Stack<Integer>st=new Stack<>();
          int[] nse=new int[n];
         for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                st.pop();
            }
            nse[i]=st.isEmpty()?n:st.peek();
            st.push(i);
         }
         return nse;
    }

     //find previous smaller element
     public int[] findPSE(int[] nums){
         int n=nums.length;
         Stack<Integer>st=new Stack<>();
          int[] pse=new int[n];

          for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()]>nums[i]){
                st.pop();
            }
            pse[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
          }
          return pse;
     }
     
     //find subarray minimums
     public long subarrayMins(int[] nums){
         int n=nums.length;
         long sum=0;
         int[] nse=findNSE(nums);
         int[] pse=findPSE(nums);
         for(int i=0;i<n;i++){
           long left=i-pse[i];
           long right=nse[i]-i;
           long freq=right*left;
           sum+=freq*nums[i];
         }
         return sum;
     }
    //find next greater element
    public int[] findNGE(int[] nums){
         int n=nums.length;
         Stack<Integer>st=new Stack<>();
          int[] nge=new int[n];
         for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
                st.pop();
            }
            nge[i]=st.isEmpty()?n:st.peek();
            st.push(i);
         }
         return nge;
    }

     //find previous smaller element
     public int[] findPGE(int[] nums){
         int n=nums.length;
         Stack<Integer>st=new Stack<>();
          int[] pge=new int[n];

          for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()]<nums[i]){
                st.pop();
            }
            pge[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
          }
          return pge;
     }
       
       //find subarray maximums
     public long subarrayMax(int[] nums){
         int n=nums.length;
         long sum=0;
         int[] nge=findNGE(nums);
         int[] pge=findPGE(nums);
         for(int i=0;i<n;i++){
           long left=i-pge[i];
           long right=nge[i]-i;
           long freq=right*left;
           sum+=freq*nums[i];
         }
       return sum;
     }
}