//207. Course Schedule
//time complexity: O(V+E), where V is number of vertices and E is number of edges
//space complexity: O(V+E)


import java.util.*;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        for(int [] prerequisite:prerequisites){
            int u=prerequisite[0];
            int v=prerequisite[1];
            adj.get(u).add(v);
        }

        int[] inDegree=new int[numCourses];

        for(int i=0;i<numCourses;i++){
            for(int it:adj.get(i)){
                inDegree[it]++;
            }
        }
         Queue<Integer>q=new LinkedList<>();
         for(int i=0;i<numCourses;i++){
              if(inDegree[i]==0){
                q.add(i);
              }
         }

         ArrayList<Integer>temp=new ArrayList<>();
         while(!q.isEmpty()){
            int node=q.remove();
            temp.add(node);

            for(int neigh:adj.get(node)){
                inDegree[neigh]--;
                if(inDegree[neigh]==0){
                    q.add(neigh);
                }
            }
         }
         if(temp.size()==numCourses){
            return true;
         }
         return false;
    }
}
