
//530. Minimum Absolute Difference in BST
//time complexity:O(n) where n is the number of nodes in the BST. This is because we need to traverse all the nodes in the BST to find the minimum absolute difference.
//space complexity:O(n) in the worst case, where n is the number of nodes in the BST. This is because we need to store the values of all the nodes in a list during the inorder traversal. However, if we consider the space used for the recursion stack, it would be O(h), where h is the height of the BST. In a balanced BST, h would be O(log n), while in an unbalanced BST, h could be O(n).     

class MinAbsDiff{
    public int getMinimumDifference(TreeNode root) {
        List<Integer>temp=new ArrayList<>();

        inorder(root,temp);
         int minDiff=Integer.MAX_VALUE;

         for(int i=1;i<temp.size();i++){
            int diff=temp.get(i)-temp.get(i-1);
            minDiff=Math.min(minDiff,diff);
         }
        return minDiff;
    }

    public void inorder(TreeNode root,List<Integer>temp){
        if(root==null){
            return;
        }

        inorder(root.left,temp);
        temp.add(root.val);
        inorder(root.right,temp);
    }
}