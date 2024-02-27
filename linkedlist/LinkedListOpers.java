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
    
    // method to remove node if val is given
    public void removeNodeIfValGiven(int value) {
        if(head == null){
            return;
        }
        if (head.data == value) {
            head = head.next;
        }
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            if (temp.data == value) {
                prev.next = prev.next.next;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    //method to insert at the head of the ll
    public void insertAtHead(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    //method to insert at the end of the ll
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        // System.out.println(temp.data);
        // System.out.println(newNode.next);
    }

    //method to insert new node at k'th idx, val is given
    public void insertAtKthIdx(int idx, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        if (idx == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        int counter = 0;
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            counter++;

            if (counter == idx) {
                prev.next = newNode;
                newNode.next = temp;  
                return;              
            }
            prev = temp;
            temp = temp.next;
        }
        if (counter +1 ==  idx) {
            prev.next = newNode;
        }        
    }

    //method to insert before the given value
    public void insertBeforeTheVal(int val, int data) {
        Node newNode =  new Node(data);
        if (head == null) {
            return;
        }
        if (head.data == val) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        Node prev = null;

        while (temp != null) {
            if (temp.data == val) {
                prev.next = newNode;
                newNode.next = temp;
                return;
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

        //remove node if val is given
        linkedList.addNode(14);
        linkedList.addNode(14);
        linkedList.print();
        int val = 14;
        linkedList.removeNodeIfValGiven(val);
        System.out.println("LL after removing node whose val = " + val);
        linkedList.print();

        //insert at head
        linkedList.insertAtHead(17);
        System.out.println("Inserting data 17 at the head of the ll");
        linkedList.print();

        //insert at end
        linkedList.insertAtEnd(19);
        System.out.println("Inserting data 19 at the end of the ll");
        linkedList.print();
        // linkedList.removeTail();
        // linkedList.removeTail();
        // linkedList.removeTail();
        // linkedList.removeKth(17);
        // linkedList.removeHead();
        // linkedList.print();
        // linkedList.insertAtEnd(19);
        // linkedList.print();
        // linkedList.removeHead();
        // linkedList.print();
        // linkedList.insertAtKthIdx(1,1);
        // linkedList.print();
        linkedList.insertAtKthIdx(5,13);
        System.out.println("Inserting data 13 at the idx 5 of the ll");
        linkedList.print();
        linkedList.insertBeforeTheVal(17,130);
        System.out.println("Inserting data 130 before the value 17 of the ll");
        linkedList.print();


        
    }
}
