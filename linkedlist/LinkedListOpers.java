package linkedlist;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListOpers {
    private Node head;

    public LinkedListOpers() {
        this.head = null;
    }

    // Method to add a new node to the end of the linked list
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to print the linked list
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to calculate the length of the linked list
    public int length() {
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Method to remove the head node
    public void removeHead() {
        if (head != null) {
            head = head.next;
        }
    }

    //method to remove the tail
    public void removeTail(){
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    } 

    //method to remove k the element 
    public void removeKth(int k){
        if(head == null){
            return;
        }
        if(k==1){
            head = head.next;
        }
        int counter = 0;
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            counter++;
            if (counter == k) {
                prev.next = prev.next.next;
            }
            prev = temp;
            temp = temp.next;
        }
    }
}

 class Main {
    public static void main(String[] args) {
        LinkedListOpers linkedList = new LinkedListOpers();

        // Adding nodes to the linked list
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(4);

        // Printing the linked list
        System.out.println("Linked List:");
        linkedList.print();

        // Printing the length of the linked list
        System.out.println("Length of the Linked List: " + linkedList.length());

        // Removing the head node
        linkedList.removeHead();
        System.out.println("Linked List after removing the head node:");
        linkedList.print();

        //remove tail
        linkedList.removeTail();
        System.out.println("Linked list after removing the tail");
        linkedList.print();

        //remove kth element
        int k = 2;
        linkedList.removeKth(k);
        System.out.println("ll after removing kth element: " + k);
        linkedList.print();
    }
}
