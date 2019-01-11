package Chapter3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackUsingQueues {

	static NodeDLL head;
	static Queue<Integer> queue = new LinkedList<Integer>();

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int data = 0;

		while (true) {

			System.out.println("Enter data  : ");
			data = input.nextInt();
			input.nextLine();

			if (data > 0) {
				addElements(data);
			} else {
				break;
			}

		}

		push();

		printStack();

		pop();

	}

	public static void pop() {

		System.out.println();
		System.out.println("Element Removed : ");

		System.out.print(queue.remove());

	}

	public static void push() {

		NodeDLL current = head;

		//System.out.println("Current pointing at : " + current.data);

		while (current.next != null) {

			queue.add(current.data);

			current = current.next;

		}
		queue.add(current.data);

	}

	public static void printStack() {

		System.out.println();

		System.out.println("Stack Elements  :");

		for (int i : queue) {
			System.out.print(i + " ");
		}
	}

	public static void addElements(int data) {

		NodeDLL newNode = new NodeDLL(data);

		newNode.prev = null;
		newNode.next = head;

		if (head != null) {

			head.prev = newNode;
		}

		head = newNode;

	}

}
