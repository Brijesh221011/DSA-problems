


public class RotateList {
//       public class ListNode {
//       int val;
//       ListNode next;
//      ListNode() {}
//       ListNode(int val) { this.val = val; }
//       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//   }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int sz=1;
        ListNode tail=head;
        while(tail.next!=null){
           sz++; 
           tail=tail.next;
        }
        tail.next=head;
        k=k%sz;
        int n=sz-k;
        ListNode temp=head;
        int idx=1;
        while(idx<n){
            temp=temp.next;
            idx++;
        }
           ListNode newHead=temp.next;
           temp.next=null;
           return newHead;
    }
}
