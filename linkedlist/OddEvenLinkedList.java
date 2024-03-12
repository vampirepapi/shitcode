class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        //will be needing pointers
        ListNode oddStart = head;
        ListNode evenStart = head.next;
        //preserving head for starting even node
        ListNode evenHead = head.next;

        //looping through the list and rearranging the nodes
        while (evenStart!=null && evenStart.next!=null) {
            oddStart.next=oddStart.next.next;
            evenStart.next=evenStart.next.next;

            oddStart = oddStart.next;
            evenStart = evenStart.next;
        }
        oddStart.next = evenHead;
        return head;
    }
    public static void main(String[] args) {
        // head = [1,2,3,4,5]
        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        OddEvenLinkedList obj = new OddEvenLinkedList();
        obj.oddEvenList(node1);

        ListNode temp = node1;
        while (temp!=null) {
            System.out.println(temp.val);
            temp=temp.next;
        } 
    }
}


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
// bruteforce approach
// class Solution {
//     public ListNode oddEvenList(ListNode head) {
//         //if head is null or ll have only 1 val
//         if (head == null || head.next == null) {
//             return head;
            
//         }

//         List<Integer> vals = new ArrayList<>();

//         //for odd nodes
//         ListNode temp = head;
//         while (temp!=null && temp.next!=null) {
//             vals.add(temp.val);
//             temp=temp.next.next;
//         }
//         //suppose we are on the last node and next is null
//         if (temp!=null) {
//             vals.add(temp.val);
//         }

//         //for even nodes
//         temp = head.next;
//         while (temp!=null && temp.next!=null) {
//             vals.add(temp.val);
//             temp=temp.next.next;
//         }
//         //if on last node
//         if (temp!=null) {
//             vals.add(temp.val);
//         }
        
//         //replace each node val with vals from vals arraylist
//         int i =0;
//         temp = head;
//         while (temp!=null) {
//             temp.val = vals.get(i);
//             i++;
//             temp=temp.next;
//         }
//         return head;
//     }
// }