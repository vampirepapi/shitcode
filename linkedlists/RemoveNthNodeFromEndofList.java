package linkedlists;


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //init pointers
        ListNode slow = head;
        ListNode fast = head;
        //move fast pointer n steps ahead
        for(int i=0; i<n; i++){
            fast = fast.next;
            System.out.println(fast.val);
        }
        //if fast pointer is null, it means we have to remove the first element
        if(fast == null){
            return head.next;
        }
        //move both pointers until fast pointer reaches the end
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        //remove the nth node from the end
        slow.next = slow.next.next;
        return head;

    }
    public static void main(String[] args) {
        //create a linked list
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        //connect the nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        //create an object of the class
        RemoveNthNodeFromEndofList obj = new RemoveNthNodeFromEndofList();
        //remove the nth node from the end
        ListNode head = obj.removeNthFromEnd(node1, 2);
        //print the linked list
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)

//bruteapproach - calculate length of linked list and then remove the nth node from the end

// public class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         int lenLL = lenOfLL(head);
//         int newN = lenLL - n +1;
//         int i =0;
//         ListNode temp = head;
//         ListNode prev = null;
//         while (temp!=null) {
//             i++;
//             if (i==newN) {
//                 if (prev != null) {
//                     prev.next = prev.next.next;
//                 } else {
//                     head = head.next;
//                 }
//             }
//             prev = temp;
//             temp=temp.next;
//         }
//         return head;
//     }

//     public static int lenOfLL(ListNode head) {
//         ListNode temp = head;
//         int len = 0;
//         while (temp!=null) {
//             len++;
//             temp=temp.next;
//         }
//         return len;
//     }