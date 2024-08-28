package tufplus.beginnersproblem.basicstacks;

import java.util.ArrayList;

class ArrayQueue {
    private ArrayList<Integer> queue;
    public ArrayQueue() {
        queue = new ArrayList<>();
    }

    public void push(int x) {
        queue.add(x);
       
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        return queue.remove(0);
      
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        return queue.get(0);
        
    }

    public boolean isEmpty() {
        return queue.size()==0;
    }
}

