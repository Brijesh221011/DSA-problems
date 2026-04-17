
// 700. Search in a Binary Search Tree
//time complexity O(logn) in average case and O(n) in worst case when the tree is skewed
//space complexity O(1) for iterative approach and O(h) for recursive approach where h is the height of the tree
class SearchInBST{
    public TreeNode searchBST(TreeNode root, int val) {
        while(root!=null){
        if(root.val==val){
            return root;
        }else if(root.val<val){
            root=root.right;
        }else{
            root=root.left;
        }
        }
        return null;
    }

}