package Chapter3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class StackofStacks {

	static int THRESHOLD = 5;
	static ArrayList<Stack> list_stacks = new ArrayList<Stack>();
	static int stack_number = 1;
	static Stack<Integer> stack = new Stack<Integer>();

	static int j = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while (true) {

			System.out.println("Enter Data for Stack  : " + stack_number);
			int data = input.nextInt();
			input.nextLine();
			if (data < 0) {
				break;
			} else {
				makeNewStack(data);

			}
		}
		System.out.println("Array List Size  :" + list_stacks.size());
		
		
		for(Stack s :  list_stacks) {
			System.out.println("Elments from Stack : " + (stack_number-1));
			while(!s.isEmpty()) {
				
				System.out.println(s.pop());
				
			}
			stack_number = stack_number-1;
		}

	}

	public static void makeNewStack(int data) {

			if (j < THRESHOLD) {

				if (data > 0) {

					if (stack.isEmpty()) {

						System.out.println("First Entry : ");
						stack.push(data);
						list_stacks.add(stack);
						j = j + 1;

					} else {

						stack.push(data);
						j = j + 1;

					}
				} 

			} else {
				System.out.println("Stack Number " + stack_number + " is full");
				stack =  new Stack();
				j = 0;
				stack_number = stack_number + 1;

			}

		}

	

}