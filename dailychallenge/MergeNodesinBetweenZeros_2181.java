package dailychallenge;

public class MergeNodesinBetweenZeros_2181 {
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
