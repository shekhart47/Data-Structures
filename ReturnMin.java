package Chapter3;

import java.util.Scanner;
import java.util.Stack;

public class ReturnMin {

	static Stack<Integer> stack = new Stack<Integer>();
	public static int min = -1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("Enter Data : ");
			int data = input.nextInt();

			if (data < 0) {
				System.out.println("Push operation Stopped");
				System.out.println();
				break;
			} else {
				input.nextLine();

				
				pushElements(data);

			}

		}

		System.out.println();
		System.out.println("Minimum Element : " +  min);
		
		System.out.println();
		// int pop = popElements();
		while (!stack.isEmpty()) {
			System.out.println("Popped Element : " + stack.pop());
		}

	}

	public static void pushElements(int data) {

		if (stack.isEmpty()) {
			min = data;
		}

		if (data < min) {
			min = data;

		}
		stack.push(data);

	}

	public static int popElements() {
		return stack.isEmpty() ? -1 : stack.pop();
	}

}
