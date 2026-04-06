class FlattenBTToLL{
     public void flatten(TreeNode root) {
        List<Integer>list=new ArrayList<>();

        TreeNode temp=root;
       
       preorder(root,list);
        for(int i=1;i<list.size();i++){
            temp.left=null;
            temp.right=new TreeNode(list.get(i));
            temp=temp.right;
        }
        
    }

    public void preorder(TreeNode root,List<Integer>list){
        if(root==null){
            return;
        }
         
         list.add(root.val);
         preorder(root.left,list);
         preorder(root.right,list);
         
    }
}