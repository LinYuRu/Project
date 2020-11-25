package ch24_Collection;

import java.util.Stack;

public class stack_test {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(65);
		stack.push(-1);
		stack.push(0);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.push(6);
		stack.push(-1);
		stack.push(0);
		System.out.println(stack);
		if(!stack.empty()) {
		System.out.println(stack.peek());
			
		}
		System.out.println(stack.search(5));
	}

}
