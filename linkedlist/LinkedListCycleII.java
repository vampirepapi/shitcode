package linkedlist;

import java.util.HashSet;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycleII {
    // Bruteforce approacj -
    // public ListNode detectCycle(ListNode head) {
    //     HashSet<ListNode> hashSet = new HashSet<>();
    //     ListNode temp = head;
    //     while (temp!=null) {
    //         if(hashSet.contains(temp)){
    //             return temp;
    //         }
    //         hashSet.add(temp);
    //         temp = temp.next;
    //     }
    //     return temp;
        
    // }
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode entry = head;

        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow==fast) {
                while (slow!=entry) {
                    slow = slow.next;
                    entry=entry.next;
                }
                return slow;   
            }
            
        }
        return null;
    }
}