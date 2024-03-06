package linkedlist;

class Node {
    int val;
    Node next;

    Node(int x) {
        this.val = x;
        this.next = null;
    }

    // Constructor that accepts a value and a Node object for the next variable
    Node(int x, Node next) {
        this.val = x;
        this.next = next;
    }

}

public class LengthOfTheLinkedList {
    public static int lengthOfLL(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node node5 = new Node(5, null);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);

        System.out.println(lengthOfLL(node1));

    }

}