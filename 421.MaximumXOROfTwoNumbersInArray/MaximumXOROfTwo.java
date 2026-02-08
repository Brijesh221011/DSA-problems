//421. Maximum XOR of Two Numbers in an Array
//time complexity: O(N*32) where N is the number of elements in the array and 32 is the number of bits in an integer.
//space complexity: O(N*32) in the worst case when all numbers are distinct and have different bits.


public class MaximumXOROfTwo {
 class Node{
    Node links[]=new Node[2];
    
    boolean contains(int idx){
        return links[idx]!=null;
    }

    void put(int idx,Node node){
        links[idx]=node;
    }

    Node get(int idx){
        return links[idx];
    }
 }
  
 Node root=new Node();
  

    void insert(int num){
        Node node=root;
        for(int i=31;i>=0;i--){
            int bit=(num>>i) & 1;
            if(!node.contains(bit)){
                node.put(bit,new Node());
            }
            node=node.get(bit);
        }
    }

    int getMaxXor(int num){
        Node node=root;
        int maxNum=0;

        for(int i=31;i>=0;i--){
            int bit=(num>>i) & 1;
            if(node.contains(1-bit)){
                maxNum=maxNum | (1<<i);
                node=node.get(1-bit);
            }else{
                node=node.get(bit);
            }
        }
        return maxNum;
    }
    
    public int findMaximumXOR(int[] nums) {
        int n=nums.length;

        for(int num:nums){
            insert(num);
        }
        int res=0;

        for(int i=0;i<n;i++){
          res=Math.max(res,getMaxXor(nums[i]));
        }
        return res;
    }
}
