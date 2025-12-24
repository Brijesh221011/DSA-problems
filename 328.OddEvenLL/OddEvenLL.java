

public class OddEvenLL {
     public ListNode oddEvenList(ListNode head) {
        
         if(head==null){
            return head;
        }
        ListNode dummyE=new ListNode(-1);
        ListNode dummyO=new ListNode(-1);
        
        ListNode oddNodes=dummyO;
        ListNode evenNodes=dummyE;
        ListNode temp=head;
           int idx=1;
        while(temp!=null){
            if(idx%2==0){
                evenNodes.next=temp;
                evenNodes=evenNodes.next;
               
            }
            else{
                oddNodes.next=temp;
                oddNodes=oddNodes.next;
            }
            idx++;
             temp=temp.next;
        }
        oddNodes.next=dummyE.next;
        evenNodes.next=null;
        return dummyO.next;
    }
}
