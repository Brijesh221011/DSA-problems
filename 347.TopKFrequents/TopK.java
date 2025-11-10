import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopK {

    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer>hm=new HashMap<>();
        for(int num:nums){
             hm.put(num,hm.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->hm.get(b)-hm.get(a));
         pq.addAll(hm.keySet());
         
         int []res=new int[k];
         for(int j=0;j<k;j++){
            res[j]=pq.remove();
         }
        return res;
    }
    
}
