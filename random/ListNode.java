package random;

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

class InsertGreatestCommonDivisorsinLinkedList_2807 {
    public int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        ListNode next = curr.next;
        while (next != null) {
            ListNode temp = new ListNode(0);
            int gcd = gcd(curr.val, next.val);
            temp.val = gcd;
            curr.next = temp;
            temp.next = next;
            curr = curr.next.next;
            next = next.next;
        }
        return head;
    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr = list1;
        ListNode next = curr.next;
        int i = 0;
        while (curr.next != null) {
            if (i + 1 == a) {
                next.next = list2;
            }
        }
        return list1;
    }
}