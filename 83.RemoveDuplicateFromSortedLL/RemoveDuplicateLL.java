
//83. Remove Duplicates from Sorted List
//time complexity: O(n), where n is the number of nodes in the linked list
//space complexity: O(1), as we are using only a constant amount of extra space

class RemoveDuplicateLL.java{
     public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

         ListNode temp=head;

         while(temp!=null && temp.next!=null){
            while(temp.next!=null && temp.val==temp.next.val){
                temp.next=temp.next.next;
            }
            temp=temp.next;
         }
         return head;
    }
}