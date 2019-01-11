package Chapter3;

import java.util.Scanner;
import java.util.Stack;

public class FindMinimum {

	static Stack<Integer> stack = new Stack<Integer>();
	static int min = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int data = 0;

		while (true) {

			System.out.println("Enter Data to Push : ");
			data = input.nextInt();
			input.nextLine();

			if (data != -100) {

				addElements(data);
			} else {
				break;
			}

		}

		System.out.println("Stack Top : " + popElement());
		
		System.out.println("Minimum Element : "+  min);

	}

	public static void addElements(int data) {

		if (stack.isEmpty()) {
			min = data;

		}

		if (data < min) {
			min = data;
		}

		stack.push(data);

	}

	public static int popElement() {
		return stack.pop();
	}

}
