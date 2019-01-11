package Chapter3;

import java.util.Scanner;
import java.util.Stack;

public class CompareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter String  s1 : ");
		String s1 = input.nextLine();

		System.out.println("Enter String s2 : ");
		String s2 = input.nextLine();

		System.out.println(buildString(s1).equals(buildString(s2)));

	}

	public static String buildString(String s) {

		Stack<Character> stack = new Stack<Character>();

		for (char c : s.toCharArray()) {

			if (c != '#') {
				stack.push(c);
			} else {
				if (!stack.isEmpty()) {
					stack.pop();
				}
			}

		}
		
		String string = "";
		for(char x : stack) {
			
			string+= Character.toString(x);
		}

		return string;

	}

}
