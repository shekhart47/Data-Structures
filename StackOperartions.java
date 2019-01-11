package Chapter3;

import java.util.Scanner;
import java.util.Stack;

public class StackOperartions {

	static Stack<Integer> stack = new Stack<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the # of Inputs : ");
		int size = input.nextInt();
		input.nextLine();

		if (size >= 1 && size <= 1000) {
			String[] str = new String[size];

			for (int i = 0; i < str.length; i++) {

				System.out.println("Enter String : " + (i + 1));
				str[i] = input.nextLine();

			}
			for (String s : str) {
				System.out.print(s + " ");
			}

			stackOperations(str);

		}

	}

	public static void stackOperations(String[] ops) {

		for (String s : ops) {

			if (s.equals("+")) {

				int top = stack.pop();

				int nextTop = stack.peek();
				int sum = top + nextTop;
				stack.push(top);
				stack.push(sum);

				System.out.println("Stack Now has  : " + stack.peek());

			} else if (s.equals("C")) {

				stack.pop();

			} else if (s.equals("D")) {

				stack.push(2 * stack.peek());

			} else {

				stack.push(Integer.parseInt(s));

			}

		}

		int sum = 0;
		for (int i : stack) {
			sum = sum + i;
		}

		System.out.println(sum);

	}

}
