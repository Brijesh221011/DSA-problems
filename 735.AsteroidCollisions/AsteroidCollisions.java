
//Problem 735. Asteroid Collisions
//time complexity: O(n),where n is the number of asteroids
//space complexity: O(n),for stack

import java.util.*;

public class AsteroidCollisions {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer>st=new Stack<>();

         for(int i=0;i<n;i++){
            if(asteroids[i]>0){
                st.push(asteroids[i]);
            }else{  
            while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(asteroids[i])){
                  st.pop();
            }
             if(!st.isEmpty() && Math.abs(asteroids[i])==st.peek()){
                st.pop();
            }else if(st.isEmpty() || st.peek()<0){
                st.push(asteroids[i]);
            }
            }
           
         }

         int[] res=new int[st.size()];
          int i=res.length-1;
         while(!st.isEmpty()){
              res[i]=st.pop();
              i--;
         }
         return res;
    }
}
