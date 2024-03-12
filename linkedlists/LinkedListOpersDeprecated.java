package linkedlists;

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

public class LinkedListOpersDeprecated {
    public static Node ConvertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
            // mover = mover.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {10,2,3,4,5,6};
        Node head = ConvertArr2LL(arr);
        System.out.println(head.data);

        //printing 
        //printing count of elements in the ll
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            System.out.print(temp.data + " ");
           
            temp = temp.next;
        }
        System.out.println();

        System.out.println("count" + "->" + count);
    }
    
}
