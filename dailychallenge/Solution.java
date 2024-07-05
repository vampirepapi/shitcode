package dailychallenge;

// package dailychallenge;

import java.util.ArrayList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        // init 3 ptrs
        ListNode slow = head;
        ListNode curr = slow.next;
        ListNode fast = curr.next;

        // if fast is pointing to null return [-1 -1]
        if (fast == null)
            return new int[] { -1, -1 };

        // storing idx to find diff bw critical points
        ArrayList<Integer> list = new ArrayList<>();
        int idx = 1;

        // itr through linked list nodes
        while (fast != null) {
            idx++;
            // local maxima
            if (curr.val > slow.val && curr.val > fast.val) {
                list.add(idx);
            } else if (curr.val < slow.val && curr.val < fast.val) {
                list.add(idx);
            }
            slow = slow.next;
            curr = curr.next;
            fast = fast.next;
        }
        // if list has no distinct cp's
        if (list.size() <= 1) {
            return new int[] { -1, -1 };
        }
        int localmax = 0;
        int localmin = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            int min = list.get(i) - list.get(i - 1);
            System.out.println(min);
            if (localmin > min)
                localmin = min;
        }
        localmax = list.get(list.size() - 1) - list.get(0);
        System.out.println(list);
        return new int[] { localmin, localmax };
    }
}