package Chapter3;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStack {
	static Stack<Integer> s1 = new Stack<Integer>();
	static Stack<Integer> s2 = new Stack<Integer>();

	/** Initialize your data structure here. */
	public QueueUsingStack() {

	}

	/** Push element x to the back of queue. */
	public void push(int x) {

		s1.push(x);

		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}

	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {

		return s2.pop();

	}

	/** Get the front element. */
	public int peek() {

		return s2.peek();

	}

	/** Returns whether the queue is empty. */
	public boolean empty() {

		return s2.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingStack obj = new QueueUsingStack();
		
		Scanner input =  new Scanner(System.in);
		for(int i = 0 ; i < 3; i++) {
			System.out.println("Enter element to Push : ");
			int data =  input.nextInt();
			obj.push(data);
		}

		
		System.out.println("Popped Element :  " +  obj.pop());
		
		System.out.println("Peeked Element :  " +  obj.peek());
		
		System.out.println("Queue Empty :  " +  obj.empty());
		
		
	}

}
