package tufplus.beginnersproblem.basicstacks;

import java.util.ArrayList;

class ArrayStack {
    private ArrayList<Integer> stack;
    public ArrayStack() {
        stack = new ArrayList<>();
    }

    public void push(int x) {
	   stack.add(x);
    }

    public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		return stack.remove(stack.size()-1);
    }

    public int top() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		return stack.get(stack.size()-1);
    }

    public boolean isEmpty() {
        return stack.size()==0;
    }
}

