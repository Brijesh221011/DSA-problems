
//99. Recover Binary Search Tree
//time complexity: O(n), where n is the number of nodes in the tree.
//space complexity: O(h), where h is the height of the tree, due to the recursive call stack.

class RecoverBST{
    TreeNode prev=new TreeNode(Integer.MIN_VALUE);
    TreeNode fir=null;
    TreeNode sec=null;

    public void recoverTree(TreeNode root) {
        inorder(root);
        int temp=fir.val;
        fir.val=sec.val;
        sec.val=temp;
    }
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }

        inorder(root.left);

        if(prev!=null && prev.val>root.val){
            if(fir==null){
                fir=prev;
            }
            sec=root;
        }
        prev=root;
        inorder(root.right);

    }
}