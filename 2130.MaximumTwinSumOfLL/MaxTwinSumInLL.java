
//2130. Maximum Twin Sum of a Linked List
//time complexity: O(n),where n is the number of nodes in the linked list
//space complexity: O(1), as we are using only two pointers

class MaxTwinSumInLL {

     public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
              slow=slow.next;
              fast=fast.next.next;
        }

        ListNode firstHalf=head;
        ListNode secondHalf=reverseList(slow);

        int maxTwinSm=Integer.MIN_VALUE;
        while(secondHalf!=null){
            int sum=firstHalf.val+secondHalf.val;
            maxTwinSm=Math.max(maxTwinSm,sum);
            firstHalf=firstHalf.next;
            secondHalf=secondHalf.next;
        }
       return  maxTwinSm;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        return prev;
    }
}