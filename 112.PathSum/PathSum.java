
// 112. Path Sum
//time complexity: O(n), where n is the number of nodes in the binary tree, as we need to visit each node once to check for the path sum
//space complexity: O(h), where h is the height of the binary tree, due to the recursive call stack used for depth-first traversal. In the worst case, when the tree is skewed, the height can be equal to the number of nodes, resulting in O(n) space complexity.

class PathSum{
     public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        targetSum-=root.val;
        if(root.left==null && root.right==null){
            return targetSum==0;
        }
        return hasPathSum(root.left,targetSum) || hasPathSum(root.right,targetSum);
    }

}