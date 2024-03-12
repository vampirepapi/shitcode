package linkedlists;

// Node class to represent each element in the linked list
class Node{
    int data;  // data part of the node
    Node next; // reference to the next node in the list

    // constructor of the class Node
    // initializes the data part and the next reference
    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }

    // constructor of the class Node
    // initializes the data part and sets next reference to null
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class ArrToLL {
    // method to convert an array to a linked list
    public static Node ConvertArr2LL(int[] arr){
        // create the head node with the first element of the array
        Node head = new Node(arr[0]);
        // mover node to traverse the list
        Node mover = head;
        // loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // create a new node with the current array element
            Node temp = new Node(arr[i]);
            // link the new node to the list
            mover.next = temp;
            // move the mover to the new node
            mover = temp;
        }
        // return the head of the list
        return head;
    }

    // main method to test the code
    public static void main(String[] args) {
        // array to be converted to a linked list
        int[] arr = {10,2,3,4,5};
        // convert the array to a linked list
        Node head = ConvertArr2LL(arr);
        // print the data part of the head node
        System.out.println(head.data);
    }
    
}