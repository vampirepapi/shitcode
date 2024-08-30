package tufplus.beginnersproblem.basicstacks;

class LinkedListQueue {
    //class level vars
    private Node head;
    private Node temp;
    
    //node class
    private class Node{
        int val;
        Node next;
        Node(int x){
            this.val=x;
            this.next=null;
        }
    }
    public LinkedListQueue(){
        head=null;
        temp=head;
    }

    public void push(int x){
        Node newNode = new Node(x);
        if (head==null) {
            head=newNode;
            temp=head;
        }
        else{
            temp.next = newNode;
            temp=newNode;
        }
    }

    public int pop() {
        if (head==null) {
            return -1;
        }
        int val = head.val;
        head=head.next;
        return val; 
    }

    public int peek() {
        return head.val;
        
    }
    public boolean isEmpty() {
        return head==null;
    }
}
