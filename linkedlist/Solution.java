package linkedlist;

//   Definition for singly-linked list.
class ListNode {
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

public class Solution {
    public ListNode middleNode(ListNode head) {
        int length = lengthOfLL(head);
        float middleOfLL;
        if (length % 2 == 0) {
            middleOfLL = (length / 2)+1;
        } else {
            middleOfLL = (float) Math.ceil(length / 2.0f);
        }

        int counter = 0;
        ListNode temp = head;
        while (temp != null) {
            counter++;
            if (counter == middleOfLL) {
                head = temp;
                return head;
            }
            temp = temp.next;

        }
        return null;
    }

    public static int lengthOfLL(ListNode node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    public static void main(String[] args) {
        // Create nodes
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        // Link nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        // Find middle node
        Solution solution = new Solution();
        ListNode middleNode = solution.middleNode(node1);

        // Print middle node
        ListNode itr = middleNode;
        while (itr != null) {
            System.out.println(itr.val);
            itr = itr.next;
        }
    }

}