
//987. Vertical Order Traversal of a Binary Tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class VerticalOrderTraversal {
     
    class Tuple{
        TreeNode node;
        int row;
        int col;
        Tuple(TreeNode node,int r,int c){
            this.node=node;
            this.row=r;
            this.col=c;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>hm=new TreeMap<>();
       Queue<Tuple>q=new LinkedList<>();
       q.add(new Tuple(root,0,0));

       while(!q.isEmpty()){
        Tuple curr=q.remove();
        TreeNode temp=curr.node;
        int x=curr.row;
        int y=curr.col;

        if(!hm.containsKey(x)){
            hm.put(x,new TreeMap<>());
        }
        if(!hm.get(x).containsKey(y)){
            hm.get(x).put(y,new PriorityQueue<>());
        }

        hm.get(x).get(y).add(temp.val);

        if(temp.left!=null){
            q.add(new Tuple(temp.left,x-1,y+1));
        }
        if(temp.right!=null){
            q.add(new Tuple(temp.right,x+1,y+1));
        }
       }
       List<List<Integer>>res=new ArrayList<>();

       for(TreeMap<Integer,PriorityQueue<Integer>>ele:hm.values()){
         res.add(new ArrayList<>());

         for(PriorityQueue<Integer>pq:ele.values()){
            while(!pq.isEmpty()){
                res.get(res.size()-1).add(pq.remove());
            }
         }
       }
       return res;
    }
}