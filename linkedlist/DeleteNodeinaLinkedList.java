package linkedlist;

//   Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class DeleteNodeinaLinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args){
        //creating node
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(9);

        //linking nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        //printing linked list before deletion
        printList(node1);

        //creting obj of DeleteNodeinaLinkedList
        DeleteNodeinaLinkedList deleteNodeinaLinkedList = new DeleteNodeinaLinkedList();
        //calling deleteNode method with param as node2
        deleteNodeinaLinkedList.deleteNode(node2);

        //printing ll after deletion of node2
        printList(node1);

    }

    // Method to print a linked list
    public static void printList(ListNode node){
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}