
// 2095. Delete the Middle Node of a Linked List
//time complexity: O(n), where n is the number of nodes in the linked list
//space complexity: O(1)

class DeleteMiddleNode{
     public ListNode deleteMiddle(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            head=head.next;
            return head;
        }
        ListNode slow=new ListNode(-1);
        slow.next=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;

        return head;
    }
}