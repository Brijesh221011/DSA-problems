class BinaryTreeInfected{

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


    public int amountOfTime(TreeNode root, int start) {
        Map<Integer,List<Integer>>graph=new HashMap<>();
        
        buildGraph(root,null,graph);
        
        Set<Integer>vis=new HashSet<>();
        
        Queue<Integer>q=new LinkedList<>();
        q.add(start);
        vis.add(start);
        
        int time=0;
        
        while(!q.isEmpty()){
            int n=q.size();
            boolean infected=false;   
            
            for(int i=0;i<n;i++){
                int node=q.remove();
                
                for(int neigh:graph.getOrDefault(node,new ArrayList<>())){
                
                if(!vis.contains(neigh)){
                    vis.add(neigh);
                    q.add(neigh);
                    infected=true;
                }
                }
                
            }
            if(infected){
                time++;
            }
            
        }
        return time;
    }
    public void buildGraph(TreeNode root,TreeNode par,Map<Integer,List<Integer>>graph){
        if(root==null){
            return;
        }
        if(par!=null){
            graph.computeIfAbsent(root.val,k->new ArrayList<>()).add(par.val);
            graph.computeIfAbsent(par.val,k->new ArrayList<>()).add(root.val);
        }
        
        buildGraph(root.left,root,graph);
        buildGraph(root.right,root,graph);
    }
}