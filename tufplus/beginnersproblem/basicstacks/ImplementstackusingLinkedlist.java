package tufplus.beginnersproblem.basicstacks;

class LinkedListStack {
    private Node head;
    private Node temp;

    private class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public LinkedListStack() {
        head = null;
        temp = null;
    }

    public void push(int x) {
        if (head == null) {
            head = new Node(x);
            temp = head;
        } else {
            Node newNode = new Node(x);
            temp.next = newNode;
            temp = newNode;
        }
    }

    public int pop() {
        if (head == null) {
            return -1; // Return -1 if the stack is empty
        }

        // If there's only one element in the stack
        if (head == temp) {
            int value = head.val;
            head = null;
            temp = null;
            return value;
        }

        // Traverse to the second-to-last element
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }

        int value = curr.next.val; // Get the value of the last element
        curr.next = null; // Remove the last element
        temp = curr; // Update temp to the new last node
        return value;
    }

    public int top() {
        if (temp == null) {
            return -1; // Return -1 if the stack is empty
        }
        return temp.val;
    }

    public boolean isEmpty() {
        return head == null; // Stack is empty if head is null
    }
}

