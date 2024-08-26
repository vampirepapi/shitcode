package tufplus.beginnersproblem.basiclinkedlist;

public class DeleteKthElementofDLL {
    public ListNode deleteKthElement(ListNode head, int k) {
        if (k == 1) {
            // Handle deletion of the head node.
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }

        ListNode temp = head;
        ListNode prevNode = null;
        int cnt = 0;

        // Traverse the list to find the k-th node.
        while (temp != null) {
            cnt++;
            if (cnt == k) {
                // Delete the k-th node.
                prevNode.next = prevNode.next.next;
                if (temp.next != null) {
                    // Update the prev pointer of the next node if it exists.
                    temp.next.prev = prevNode;
                }
                break;
            }
            prevNode = temp;
            temp = temp.next;
        }
        return head;
    }
}

