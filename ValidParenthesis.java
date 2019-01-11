package Chapter3;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {

	static Stack<Character> stack1 = new Stack<Character>();
	static Stack<Character> stack2 = new Stack<Character>();
	static Stack<Character> stack3 = new Stack<Character>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter String : ");
		String str1 = input.nextLine();

		System.out.println(checkBraces(str1));

	}

	public static boolean checkBraces(String str) {

		int length = str.length();

		int l1 = length / 2 - 1;
		// int l2 = length - l1 + 1;

		char[] c1 = str.toCharArray();

		int i = 0;

		while (i < length) {

			if (c1[i] == '(' || c1[i] == '[' || c1[i] == '{') {
				stack1.push(c1[i]);
				i = i + 1;
			} else {
				stack2.push(c1[i]);
				i = i + 1;
			}
		}

		System.out.println();
		System.out.print("Stack 1 element(s) - >");
		for (char z : stack1) {
			System.out.print(z + " ");
		}

		System.out.println();
		System.out.print("Stack 2 element(s) - >");
		for (char y : stack2) {
			System.out.print(y + " ");
		}

		System.out.println();
		boolean flag = false;

		while (!stack1.isEmpty() && !stack2.isEmpty()) {

			if ((Character.toString(stack1.peek()).equals("(") && Character.toString(stack2.peek()).equals(")"))
					|| (Character.toString(stack1.peek()).equals("[") && Character.toString(stack2.peek()).equals("]"))
					|| (Character.toString(stack1.peek()).equals("{") && Character.toString(stack2.peek()).equals("}"))

			) {

				flag = true;
				stack1.pop();
				stack2.pop();

//			System.out.println("Checking Stack 1 and Stack 2 elements");
//			System.out.println();
//
//			int size1 = stack1.size();
//			int size2 = stack2.size();
//			
//			while (size1 >=0 && size2 >=0) {
//System.out.println();
//			
//				System.out.println("inside if -> while");
//
//				char one = stack1.pop();
//				char two = stack2.pop();
//
//				
//				System.out.println("one" + one);
//				System.out.println("two" + two);
//				
//				System.out.println("Checking equality");
//				
//				if (one == two) {
//					
//					System.out.println("Equal");
//					flag = true;
//
//					System.out.println("flag set to true");
//				} else {
//					System.out.println("NOT Equal");
//					flag = false;
//					System.out.println("flag set to false");
//					break;
//				}
//				size1 = size1-1;
//				size2 = size2-1;
//				
//			}

			} else {
				
				flag = false;
				break;

//				System.out.println();
//				System.out.println("Pushing elements in Stack 3");
//
//				while (!stack2.isEmpty()) {
//					stack3.push(stack2.pop());
//				}
//
//				System.out.println();
//				System.out.print("Stack 3 element(s)");
//				for (char z : stack3) {
//					System.out.print(z + " ");
//				}
//
//				System.out.println();
//				System.out.println("Checking Stack 1 and Stack 3 elements");
//				System.out.println();
//
//				while (!stack1.isEmpty() && !stack3.isEmpty()) {
//
//					System.out.println("inside else -> while");
//
//					char one = stack1.pop();
//					char two = stack3.pop();
//
//					if (one == two) {
//						flag = true;
//
//						System.out.println("flag set to true");
//					} else {
//						flag = false;
//						System.out.println("flag set to false");
//						break;
//					}
//				}

			}
		}

		return flag;
	}

}
