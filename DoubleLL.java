package Chapter2;

import java.util.Scanner;

public class DoubleLL {

	static NodeDLL head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int data = 0;

		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("Enter data : ");
			data = input.nextInt();
			input.nextLine();

			if (data > 0) {

				addElements(data);
			} else {
				break;
			}
		}

		//displayElements();
		reverse_displayElement();

	}

	public static void reverse_displayElement() {

		NodeDLL current = head;

		while (current.next != null) {
			current = current.next;
		}

		System.out.print(current.data + " ");
		current = current.prev;

		while (current.prev != null) {
			System.out.print(current.data + " ");
			current = current.prev;
		}
		System.out.print(current.data);

	}

	public static void displayElements() {

		NodeDLL current = head;

		while (current.next != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}

		System.out.print(current.data + " ");

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
