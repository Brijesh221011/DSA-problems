
public class kthSmallest {

//     public class TreeNode {
//       int val;
//      TreeNode left;
//       TreeNode right;
//       TreeNode() {}
//        TreeNode(int val) {
//          this.val = val;
//          }
//       TreeNode(int val, TreeNode left, TreeNode right) {
//           this.val = val;
//           this.left = left;
//           this.right = right;
//       }
//   }
     int cntNodes=0;
    int res=-1;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null){
            return 0;
        }
        kthSmallest(root.left,k);
        cntNodes++;
        if(cntNodes==k){
            res=root.val;
            return res;
        }
        kthSmallest(root.right,k);
        return res;
    }

    // public static void main(String[] args) {
    //     kthSmallest obj=new kthSmallest();
    //     TreeNode root=obj.new TreeNode(3);
    //     root.left=obj.new TreeNode(1);
    //     root.right=obj.new TreeNode(4);
    //     root.left.right=obj.new TreeNode(2);
    //     int k=5;
    //     int result=obj.kthSmallest(root,k);
    //     System.out.println(result);

    // }
} 
