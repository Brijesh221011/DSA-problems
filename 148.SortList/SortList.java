
//148. Sort List
//time complexity: O(nlogn), where n is the number of nodes in the linked list
//space complexity: O(n), where n is the number of nodes in the linked list

class SortList {

    public ListNode sortList(ListNode head) {
        List<Integer>arrL=new ArrayList<>();
        ListNode temp=head;

         while(temp!=null){
            arrL.add(temp.val);
            temp=temp.next;
         }

         Collections.sort(arrL);

         temp=head;

         for(int i=0;i<arrL.size();i++){
            temp.val=arrL.get(i);
            temp=temp.next;
         }
         return head;
    }
}