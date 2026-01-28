//Problem 1334: Find the city with the smallest number of neighbors within a given distance threshold.
//time complexity: O(N^3), where N is the number of cities
//space complexity: O(N^2), where N is the number of cities

import java.util.Arrays;

public class SmallestCity {
     public int findTheCity(int n, int[][] edges, int distanceThreshold) {

        int[][] dist=new int[n][n];

        for(int []el:dist){
            Arrays.fill(el,Integer.MAX_VALUE);
        }
         for(int[] edge:edges){
            dist[edge[0]][edge[1]]=edge[2];
             dist[edge[1]][edge[0]]=edge[2];
         }
        for(int i=0;i<n;i++){
            dist[i][i]=0;
        }

        for(int k=0;k<n;k++){
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(dist[i][k]==Integer.MAX_VALUE || dist[k][j]==Integer.MAX_VALUE){
                    continue;
                }
                dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);
            }
         } 
        }

        int cityNo=-1;
        int cntCity=n;

        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(dist[i][j]<=distanceThreshold){
                    cnt++;
                }
            }
            if(cnt<=cntCity){
                cntCity=cnt;
                cityNo=i;
            }
        }
        return cityNo;
    }
}
