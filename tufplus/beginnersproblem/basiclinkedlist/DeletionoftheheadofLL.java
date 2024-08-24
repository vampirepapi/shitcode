package tufplus.beginnersproblem.basiclinkedlist;

public class DeletionoftheheadofLL {
    public ListNode deleteHead(ListNode head) {
        if (head==null) {
            return null;
        }
        head = head.next;
        return head;
    }
    
}
