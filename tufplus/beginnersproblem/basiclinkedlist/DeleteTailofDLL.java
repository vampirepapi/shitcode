package tufplus.beginnersproblem.basiclinkedlist;

public class DeleteTailofDLL {
    public ListNode deleteTail(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        ListNode temp=head;
        while (temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;

        return head;


    }
    
}
