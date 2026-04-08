
//297. Serialize and Deserialize Binary Tree
//time complexity: O(n),where n is the number of nodes in the tree
//space complexity: O(n)


class SerializeDeserializeInBT{
     // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null){
            return "";
        }
        
        StringBuilder res=new StringBuilder();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode currN=q.remove();

            if(currN==null){
                 res.append("NULL ");
                 continue;
            }

             res.append(currN.val+" ");
             q.add(currN.left);
            q.add(currN.right);
        }
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
       if(data==null || data.length()==0) return null; 

        Queue<TreeNode>q=new LinkedList<>();
        String[] values=data.split(" ");
        TreeNode root=new TreeNode(Integer.parseInt(values[0]));

        q.add(root);
        
        int i=1;
        while(!q.isEmpty() && i<values.length){
            TreeNode par=q.remove();

            if(!values[i].equals("NULL")){
                TreeNode left=new TreeNode(Integer.parseInt(values[i]));
                par.left=left;
                q.add(left);
            }
           i++;
            if(!values[i].equals("NULL")){
                TreeNode right=new TreeNode(Integer.parseInt(values[i]));
                par.right=right;
                q.add(right);
            }
            i++;
        }
        return root;
    }
}