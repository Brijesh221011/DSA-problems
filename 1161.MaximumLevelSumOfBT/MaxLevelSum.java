import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class MaxLevelSum {

    public int maxLevelSum(TreeNode root) {
        //method-1: 
        if(root==null){
            return 0;
        }
         long maxSum=Integer.MIN_VALUE;
         int level=0;
          int currLevel=0;
        
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
             currLevel++;
            int n=q.size();
            long sum=0;
            for(int i=0;i<n;i++){
                TreeNode curr=q.remove();
                sum+=curr.val;
               
                if(curr.left!=null){
                    q.add(curr.left);
                }

                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            if(maxSum<sum){
                maxSum=sum;
                level=currLevel;
            }
            
        }

       return level;
        //method-2: 
        // if(root==null){
        //     return 0;
        // }
        //  long maxSum=Integer.MIN_VALUE;
        //  List<Long>temp=new ArrayList<>();
        // Queue<TreeNode>q=new LinkedList<>();
        // q.add(root);

        // while(!q.isEmpty()){
        //     int n=q.size();
        //     long sum=0;

        //     for(int i=0;i<n;i++){
        //         TreeNode curr=q.remove();
        //         sum+=curr.val;

        //         if(curr.left!=null){
        //             q.add(curr.left);
        //         }

        //         if(curr.right!=null){
        //             q.add(curr.right);
        //         }
        //     }
        //     maxSum=Math.max(maxSum,sum);
        //     temp.add(sum);
        // }

        // for(int i=0;i<temp.size();i++){
        //     if(temp.get(i)==maxSum){
        //         return i+1;
        //     }
        // }
        // return 0;
    }
}