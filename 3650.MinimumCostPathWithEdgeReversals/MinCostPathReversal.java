//Problem 3650. Minimum Cost Path with Edge Reversals
//time complexity: O(E log V),where E is the number of edges and V is the number of vertices
//space complexity: O(V + E),where V is the number of vertices and E is the number of edges

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class MinCostPathReversal {
    public int minCost(int n, int[][] edges) {
        ArrayList<ArrayList<int[]>>adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];
            adj.get(u).add(new int[]{v,w});
            adj.get(v).add(new int[] {u,2*w});
        }

        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int[] dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);

        pq.add(new int[]{0,0});
        dist[0]=0;

        while(!pq.isEmpty()){
            int weight=pq.peek()[0];
            int node=pq.peek()[1];
              pq.remove();
            for(int[] neigh:adj.get(node)){
                int adjNode=neigh[0];
                int adjWt=neigh[1];

                if(dist[adjNode]>weight+adjWt){
                    dist[adjNode]=weight+adjWt;
                    pq.add(new int[]{dist[adjNode],adjNode});
                }
            }
        }
        return dist[n-1]==Integer.MAX_VALUE?-1:dist[n-1];
    }
}
