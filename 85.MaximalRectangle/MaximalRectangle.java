//85. Maximal Rectangle
//time complexity: O((m+n)*m), where m is number of rows and n is number of columns
//space complexity: O(n)

import java.util.Stack;

public class MaximalRectangle {
      public int maximalRectangle(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[] heights=new int[n];
        int maxArea=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              if(matrix[i][j]=='1'){
                 heights[j]++;
               }else{
                heights[j]=0;
               }
            }
            int area=largestRectangleArea(heights);
           maxArea=Math.max(maxArea,area);
        }
        
        return maxArea;
    }

     public int largestRectangleArea(int[] heights) {
        int n=heights.length;

        Stack<Integer>st=new Stack<>();
       
       int[] nsl=new int[n];

       //finding next smaller left
        for(int i=0;i<n;i++){
             while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
             }
             if(st.isEmpty()){
                nsl[i]=-1;
             }else{
                nsl[i]=st.peek();
             }
             st.push(i);
        }
        st=new Stack<>();
        //finding next smaller right
          int[]nsr=new int[n];
         for(int i=n-1;i>=0;i--){
             while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
             }
             if(st.isEmpty()){
                nsr[i]=n;
             }else{
                nsr[i]=st.peek();
             }
             st.push(i);
        }
         
         int maxArea=0;
        for(int i=0;i<n;i++){
            int ht=heights[i];
            int w=nsr[i]-nsl[i]-1;
            int currArea=ht*w;
            maxArea=Math.max(maxArea,currArea);
        }
        return maxArea;
    }
}
