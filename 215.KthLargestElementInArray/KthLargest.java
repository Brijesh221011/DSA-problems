import java.util.*;

public class KthLargest {
     public static int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
       for(int num:nums){
        pq.add(num);
       }
        int idx=k-1;
      while(idx>0){
        pq.remove();
        idx--;
      }
      return pq.peek();
    } 
    // public static void main(String[] args) {
    //     KthLargest kl=new KthLargest();
    //     int[] nums={3,2,1,5,6,4};
    //     int k=2;
    //     System.out.println(findKthLargest(nums, k));
    // }
}
