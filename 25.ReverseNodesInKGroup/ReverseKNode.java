

class ReverseKNode{
     public ListNode reverseKGroup(ListNode head, int k) {

        //Method-1: using arraylist 
         //time complexity->O(n), space complexity->O(n) 
    //     List<Integer>list=new ArrayList<>();
    //      ListNode temp=head;

    //      while(temp!=null){
    //         list.add(temp.val);
    //         temp=temp.next;
    //      }

    //      for(int i=0;i<=list.size()-k;i+=k){
    //         reverse(list,i,i+k-1);
    //      }
    //      temp=head;

    //      for(int i=0;i<list.size();i++){
    //         temp.val=list.get(i);
    //         temp=temp.next;
    //      }
    //      return head;
    // }

    // public void reverse(List<Integer> list,int start,int end){
    //         while(start<end){
    //             int temp=list.get(start);
    //             list.set(start,list.get(end));
    //             list.set(end,temp);
    //             start++;end--;
    //         }
    // }

    //Method-2:  time complexity-> O(n), space complexity-> O(1)

     if (head == null || k == 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGrp = dummy;

        while (true) {
            ListNode kthNode = findKthNode(prevGrp, k);
            if (kthNode == null) break;

            ListNode nextGrp = kthNode.next;
            ListNode prevNode = nextGrp;
            ListNode curr= prevGrp.next;

            while (curr != nextGrp) {
                ListNode temp = curr.next;
                curr.next = prevNode;
                prevNode = curr;
                curr = temp;
            }

            ListNode temp = prevGrp.next;
            prevGrp.next = kthNode;
            prevGrp = temp;
        }
        return dummy.next;
    }

    public ListNode findKthNode(ListNode temp,int k){
        while(temp!=null && k>0){
            temp=temp.next;
            k--;
        }
        return temp;
    }
}