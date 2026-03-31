class AddTwoNumberII{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1);
      ListNode temp=dummy;
        int carry=0;
         l1=reverse(l1);
         l2=reverse(l2);

        while(l1!=null || l2!=null || carry!=0){
            int sum=carry;

            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }

            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
              temp.next=new ListNode(sum%10);
              carry=sum/10;
              temp=temp.next;
        }

        return reverse(dummy.next);
    }
     public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode next;

        while(curr!= null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        head=prev;

        return head;
    }
}