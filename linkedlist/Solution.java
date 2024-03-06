package linkedlist;


class Node {
    int data;
    Node next;

    Node(int x) {
        this.data = x;
        this.next = null;
    }

    // Constructor that accepts a dataue and a Node object for the next variable
    Node(int x, Node next) {
        this.data = x;
        this.next = next;
    }

}

class Solution {
    public boolean isPalindrome(Node head) {
        if(head==null || head.next == null){
            return true;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow=slow.next;
            fast=fast.next.next;
        }

        Node newNode = reverseALL(slow);
        Node startNode = head;

        while (newNode != null) {
            if(newNode.data != startNode.data){
                reverseALL(newNode);
                return false;
            }
            newNode = newNode.next;
            startNode = startNode.next;
        }

        reverseALL(newNode);
        return true;
    }

    public static Node reverseALL(Node head){
        Node curr = head;
        Node prev = null;
        Node nextCurr = null;
        while (curr != null) {
            nextCurr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextCurr;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node node4 = new Node(1);
        Node node3 = new Node(2);
        Node node2 = new Node(2);
        Node node1 = new Node(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        Solution sb = new Solution();
        System.out.println(sb.isPalindrome(node1));
    }
}