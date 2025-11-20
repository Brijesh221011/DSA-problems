
//time complexity: O(n)
//space complexity: O(h) where h is the height of the tree

class MaxDepth{
     public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int lh=maxDepth(root.left);
        int rh=maxDepth(root.right);

        return Math.max(lh,rh)+1;
    }
}