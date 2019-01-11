package Chapter3;

import java.util.Scanner;
import java.util.Stack;

public class ValidateSequence {

	static Stack<Integer> stack1 = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int[] pushed = new int[5];
		int[] popped = new int[5];

		for (int i = 0; i < pushed.length; i++) {

			System.out.println("Enter Elements to Push : ");
			pushed[i] = input.nextInt();
			input.nextLine();
		}

		System.out.println();
		System.out.println();

		for (int i = 0; i < popped.length; i++) {

			System.out.println("Enter Popped Elements : ");
			popped[i] = input.nextInt();
			input.nextLine();
		}

		for (int i : pushed) {
			stack1.push(i);
		}

		for (int i = popped.length - 1; i >= 0; i--) {
			stack2.push(popped[i]);
		}

		//System.out.println(stack2.peek());

		 System.out.println(validateSequence());

	}

	public static boolean validateSequence() {
		boolean flag = false;

		int top1 = stack1.pop();
		int peek1 = stack1.peek();

		int top2 = stack2.pop();
		int peek2 = stack2.peek();

		if (top1 == peek2 && peek1 == top2) {

			System.out.println("First Condition passed");

			System.out.println();

			stack1.pop();
			stack2.pop();
			flag = true;
			while (!stack1.isEmpty() && !stack2.isEmpty()) {

				if (stack1.pop() == stack2.pop()) {
					flag = true;
				} else {
					flag = false;
					break;
				}

			}

		} else {
			flag = false;
		}

		return flag;
	}

}
