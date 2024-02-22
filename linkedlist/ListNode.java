package linkedlist;

// Define a class for a node in the linked list
public class ListNode {
    int val; // Value of the node
    ListNode next; // Reference to the next node in the list

    // Constructor for ListNode
    public ListNode(int val) {
        this.val = val; // Set the value of the node
        this.next = null; // Initialize the next node as null
    }
}

// Define a class for a singly linked list
class SinglyLinkedList {
    ListNode head; // Head of the list
    ListNode tail; // Tail of the list

    // Constructor for SinglyLinkedList
    public SinglyLinkedList() {
        head = new ListNode(-1); // Initialize the head with a dummy node
        tail = head; // Set the tail as the head initially
    }

    // Method to insert a node at the end of the list
    public void insertEnd(int val) {
        tail.next = new ListNode(val); // Create a new node and set it as the next node of the tail
        tail = tail.next; // Update the tail to the newly inserted node
    }

    // Method to remove a node at a specific index
    public void remove(int index) {
        int i = 0;
        ListNode curr = head;
        // Traverse the list until the index or the end of the list is reached
        while (i < index && curr != null) {
            i++;
            curr = curr.next;
        }
        
        // If the node to be removed exists, remove it
        if (curr != null) {
            curr.next = curr.next.next; // Skip the node at the index by setting the next of the current node to the node after the next node
        }
    }

    // Method to print the list
    public void print() {
        ListNode curr = head.next; // Start from the first node
        // Traverse the list and print each node
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }

        System.out.println(); // Print a newline at the end
    }
    
}

// Define a class with a main method to test the SinglyLinkedList class
class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList(); // Create a new linked list

        // Insert some nodes at the end of the list
        list.insertEnd(0);
        list.insertEnd(2);
        list.insertEnd(3);
        list.insertEnd(4);
        list.insertEnd(5);

        list.print(); // Print the list
    }
}