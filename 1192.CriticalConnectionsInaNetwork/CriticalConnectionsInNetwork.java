//Problmem 1192. Critical Connections in a Network
//time complexity: O(V+2*E),where V is the number of vertices and E is the number of edges
//space complexity: O(V+E)+O(3*V)

import java.util.ArrayList;
import java.util.List;

public class CriticalConnectionsInNetwork {
    int timer=0;

    public void dfs(int node,int par,int[] vis,List<List<Integer>>adj,int[] tin,
    int[] low,List<List<Integer>>res){
          vis[node]=1;
          tin[node]=low[node]=timer;
          timer++;
          for(int it:adj.get(node)){
            if(it==par){
                continue;
            }
            if(vis[it]==0){
                dfs(it,node,vis,adj,tin,low,res);
                low[node]=Math.min(low[node],low[it]);
                if(low[it]>tin[node]){
                    List<Integer>temp=new ArrayList<>();
                    temp.add(it);
                    temp.add(node);
                    res.add(temp);
                }
            }else{
                low[node]=Math.min(low[node],low[it]);
            }
          }
    }
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>>adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(List<Integer>connection:connections){
            int u=connection.get(0);
            int v=connection.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] vis=new int[n];
        int[] tin=new int[n];
        int[] low=new int[n];

        List<List<Integer>>res=new ArrayList<>();
        dfs(0,-1,vis,adj,tin,low,res);
        return res;
    }
}
