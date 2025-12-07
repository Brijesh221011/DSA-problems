import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


 

public class ZigZagTraversal {

     public class TreeNode {
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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode>q=new LinkedList<>();
       int level=0;
        q.add(root);

        while(!q.isEmpty()){
            int n=q.size();
            List<Integer>temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode curr=q.remove();
                if(level%2==0){
                   temp.add(curr.val);
                }else{
                    temp.addFirst(curr.val);
                }
               
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                 
            }
            level++;
            res.add(temp);
        }
        return res;
    }
}
