package linkedlist;

class Node{
    int data;
    Node next;

    //contructor of the class Node
    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }

    Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class LinkedList1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Node nd = new Node(arr[3]);      
        System.out.println(nd.data);
    }
    
}
