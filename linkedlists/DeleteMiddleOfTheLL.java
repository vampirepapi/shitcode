package linkedlists;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class DeleteMiddleOfTheLL {
    public ListNode deleteMiddle(ListNode head) {
        //define three pointers
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        //move fast pointer two steps ahead and slow pointer one step ahead
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        //remove the middle element
        prev.next = prev.next.next;
        return head;
        
    }
}