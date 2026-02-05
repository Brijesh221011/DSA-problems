//Problem 23. Merge k Sorted Lists
//time complexity: O(Nlogk),where N is the total number of nodes and k is the number of linked lists
//space complexity: O(k)


import java.util.PriorityQueue;

public class MergeKSortedList {
    class Pair{
        int data;
        ListNode node;
        Pair(int data,ListNode node){
            this.data=data;
            this.node=node;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->a.data-b.data);

        for(ListNode t:lists){
            if(t!=null){
            pq.add(new Pair(t.val,t));
            }
        }

        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(!pq.isEmpty()){
            Pair p=pq.remove();
            temp.next=p.node;
            temp=temp.next;

            if(p.node.next!=null){
                pq.add(new Pair(p.node.next.val, p.node.next));

            }
        }
        return dummy.next;
    }
}
