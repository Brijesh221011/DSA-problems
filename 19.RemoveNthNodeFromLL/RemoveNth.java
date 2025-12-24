

public class RemoveNth {
     public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return head;
        }
        
        int sz=0;
        ListNode temp=head;
        while(temp!=null){
            sz++;
            temp=temp.next;
        }
         if(sz==n){
            head=head.next;
            return head;
         }
        int iToFind=sz-n;
        temp=head;
        int idx=1;
        while(idx<iToFind){
              temp=temp.next;
              idx++;
        }
        temp.next=temp.next.next;

        return head;
    }
}
