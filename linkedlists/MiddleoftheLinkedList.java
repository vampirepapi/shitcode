package linkedlists;


// Definition for singly-linked list.
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
//Bruteforce approach
// public class MiddleoftheLinkedList {
//     public ListNode middleNode(ListNode head) {
//         // Calculate the length of the linked list
//         int length = lengthOfLL(head);
//         float middleOfLL;
//         // If the length is even, the middle node is the (length/2)+1 node
//         if (length % 2 == 0) {
//             middleOfLL = (length / 2)+1;
//         } else {
//             // If the length is odd, the middle node is the ceil(length/2) node
//             middleOfLL = (float) Math.ceil(length / 2.0f);
//         }

//         int counter = 0;
//         ListNode temp = head;
//         // Iterate through the linked list
//         while (temp != null) {
//             counter++;
//             // When the counter reaches the middle, return the current node
//             if (counter == middleOfLL) {
//                 head = temp;
//                 return head;
//             }
//             temp = temp.next;
//         }
//         // If the linked list is empty, return null
//         return null;
//     }

//     public static int lengthOfLL(ListNode node) {
//         int count = 0;
//         // Iterate through the linked list and count the nodes
//         while (node != null) {
//             count++;
//             node = node.next;
//         }
//         // Return the count of nodes
//         return count;
//     }

//     public static void main(String[] args) {
//         // Create nodes
//         ListNode node1 = new ListNode(1);
//         ListNode node2 = new ListNode(2);
//         ListNode node3 = new ListNode(3);
//         ListNode node4 = new ListNode(4);
//         ListNode node5 = new ListNode(5);
//         ListNode node6 = new ListNode(6);

//         // Link nodes to form the linked list
//         node1.next = node2;
//         node2.next = node3;
//         node3.next = node4;
//         node4.next = node5;
//         node5.next = node6;

//         // Create a Solution object
//         MiddleoftheLinkedList solution = new MiddleoftheLinkedList();
//         // Find the middle node of the linked list
//         ListNode middleNode = solution.middleNode(node1);

//         // Print the middle node and all nodes after it
//         ListNode itr = middleNode;
//         while (itr != null) {
//             System.out.print(itr.val + " ");
//             itr = itr.next;
//         }
//     }
// }

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
public class MiddleoftheLinkedList {
    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        
    }
}