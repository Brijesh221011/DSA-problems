//1976. Number of Ways to Arrive at Destination
//time complexity: O(E log V), where E is the number of edges and V is the number of vertices


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class WaysToArriveDestination {
      class Pair{
        long first;
        int second;

        Pair(long f,int s){
            this.first=f;
            this.second=s;
        }
    }
    public int countPaths(int n, int[][] roads) {
        List<List<Pair>>adj=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int m=roads.length;
        for(int i=0;i<m;i++){
            adj.get(roads[i][0]).add(new Pair(roads[i][2],roads[i][1]));
            adj.get(roads[i][1]).add(new Pair(roads[i][2],roads[i][0]));
        }
        long MOD=1000000007;
        long dist[]=new long[n];
        Arrays.fill(dist,Long.MAX_VALUE);
        long ways[]=new long[n];
      
        dist[0]=0;
        ways[0]=1;

        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> Long.compare(x.first, y.first));

        pq.add(new Pair(0L,0));

        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            long dis=curr.first;
            int node=curr.second;
    
            for(Pair neigh:adj.get(node)){
                long wt=neigh.first;
                int adjNode=neigh.second;

                if(dis+wt<dist[adjNode]){
                     dist[adjNode]=dis+wt;
                     ways[adjNode]=ways[node];
                     pq.add(new Pair(dist[adjNode],adjNode));
                }else if(dis+wt==dist[adjNode]){
                         ways[adjNode]=(ways[node]+ways[adjNode])%MOD;
                }
            }
        }
        return (int)(ways[n-1]%MOD);
    }
}
