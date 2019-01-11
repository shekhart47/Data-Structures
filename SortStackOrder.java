package Chapter3;

import java.util.Scanner;
import java.util.Stack;

public class SortStackOrder {

	static Stack<Integer> stack1 = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		processElements();

	}

	public static void processElements() {

		Scanner input = new Scanner(System.in);
		int data = 0;
		while (true) {

			System.out.println("Data : ");
			data = input.nextInt();
			input.nextLine();

			if (data > 0) {

				if (stack1.empty()) {

					stack1.push(data);
//					System.out.println("Element");

				} else {

					if (data < stack1.peek()) {
						stack1.push(data);
					} else {

						while (!stack1.isEmpty()) {

							if (stack1.peek() < data) {

								stack2.push(stack1.pop());
							} else {
								// stack1.push(data);
								break;
							}

						}
						stack1.push(data);
						while (!stack2.isEmpty()) {

							stack1.push(stack2.pop());
						}

					}

				}

			} else {
				break;
			}

		}

		while (!stack1.isEmpty()) {
			System.out.println("Stack 1  :" + stack1.pop());
		}

	}

}
