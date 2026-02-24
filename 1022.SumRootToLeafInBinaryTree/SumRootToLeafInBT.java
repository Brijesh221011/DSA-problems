//Problem 1022: Sum of Root To Leaf Binary Numbers
//time complexity: O(n) where n is the number of nodes in the tree
//space complexity: O(h) where h is the height of the tree

class SumRootToLeafInBT{
     
       public int sumRootToLeaf(TreeNode root) {
        if(root==null){
            return 0;
        }
        return dfs(root,0);
    }

    public int dfs(TreeNode root,int currVal){
        if(root==null){
            return 0;
        }
        currVal=(currVal<<1) | root.val;

        if(root.left==null && root.right==null){
            return currVal;
        }
        return dfs(root.left,currVal) + dfs(root.right,currVal);
    }
}