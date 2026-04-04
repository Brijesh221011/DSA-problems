
// 138. Copy List with Random Pointer
//time complexity O(n) ,where n is the number of nodes in the linked list
// space complexity O(n)

class CopyListRandomPointer{

    public Node copyRandomList(Node head) {
       Node temp=head;
       Map<Node,Node>hm=new HashMap<>();

       while(temp!=null){
        Node newNode=new Node(temp.val);
        hm.put(temp,newNode);
        temp=temp.next;
       }

       temp=head;

       while(temp!=null){
        Node copyN=hm.get(temp);

        copyN.next=hm.get(temp.next);
        copyN.random=hm.get(temp.random);
        temp=temp.next;
       }  
       return hm.get(head);     
    }
}