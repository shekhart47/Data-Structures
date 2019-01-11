package Chapter3;

import java.util.Scanner;
import java.util.Stack;

public class MyQueue {

	static Stack<Integer> stack1 = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pushElements();
		getElements();
	}

	public static void pushElements() {

		Scanner input = new Scanner(System.in);
		while (true) {

			System.out.println("Enter Data : ");

			int data = input.nextInt();
			input.nextLine();

			if (data > 0) {
				stack1.push(data);

			}else {
				break;
			}

		}

	}
	
	
	public static void getElements() {
		
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		
		
		while(!stack2.isEmpty()) {
			
			System.out.println("Queue Elements : " +  stack2.pop());
		}
		
		
	}

}
