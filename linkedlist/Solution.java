class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int lenLL = lenOfLL(head);
        int newN = lenLL - n +1;
        int i =0;
        ListNode temp = head;
        ListNode prev = null;
        while (temp!=null) {
            i++;
            if (i==newN) {
                if (prev != null) {
                    prev.next = prev.next.next;
                } else {
                    head = head.next;
                }
            }
            prev = temp;
            temp=temp.next;
        }
        return head;
    }

    public static int lenOfLL(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while (temp!=null) {
            len++;
            temp=temp.next;
        }
        return len;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        Solution solution = new Solution();
        head = solution.removeNthFromEnd(head, 2);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}