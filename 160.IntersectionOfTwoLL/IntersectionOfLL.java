

public class IntersectionOfLL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       // method-1: time:O(m+n) space:O(m)

    //     Set<ListNode>set=new HashSet<>();
    //    ListNode temp1=headA;

    //    while(temp1!=null){
    //        set.add(temp1);
    //        temp1=temp1.next;
    //    }

    //    ListNode temp2=headB;
       
    //    while(temp2!=null){
    //        if(set.contains(temp2)){
    //          return temp2;
            
    //        }
    //        temp2=temp2.next;
    //    }
     //  return null;

        // method-2: time:O(m+n) space:O(1)
        
       ListNode tempA=headA,tempB=headB;
     while(tempA!=tempB){
        if(tempA==null){
           tempA=headB;
        }else{
              tempA=tempA.next;
        }

        if(tempB==null){
            tempB=headA;
        }else{
            tempB=tempB.next;
        }
     }
     return tempA;
    }
}
