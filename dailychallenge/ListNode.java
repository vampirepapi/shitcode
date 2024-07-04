package dailychallenge;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while (curr.next != null) {
            ListNode node = new ListNode(0);
            while (curr.next.val != 0) {
                node.val += curr.next.val;
                curr = curr.next;
            }
            temp.next = node;
            temp = temp.next;
            curr = curr.next;
        }
        return dummy.next;
    }
}