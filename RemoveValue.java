package Chapter2;

import java.util.Scanner;

public class RemoveValue {

	static Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int data = 0;

		while (true) {

			System.out.println("Enter Data : ");
			data = input.nextInt();
			input.nextLine();

			if (data > 0) {

				addElements(data);

			} else {
				break;
			}

		}

		displayElements();

		System.out.println();

		System.out.println("Enter Value to Delete : ");
		int value = input.nextInt();
		input.nextLine();

		deleteValue(value);
		System.out.println();
		displayElements();

	}

	public static void displayElements() {

		Node current = head;

		while (current.next != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}

		System.out.print(current.data);

	}

	public static void deleteValue(int value) {

		Node current = head;
		Node bp = head;
		if (head.data == value) {

			while (head.next.data == value) {
				head = head.next;
			}
			if (head.data == value) {
				head = head.next;
			}

		} else {

			while (current.next != null) {
				bp = current;

				if (current.next.data == value) {
					
					
					System.out.println("inside first check for value");

					while (current.next.data == value) {
						
						System.out.println("inside while");
						
						current = current.next;

						

						if (current.next == null) {
							break;
						}

					}

					System.out.println("outside  while");
					
					
					if (current.data == value) {

						System.out.println("inside last current  == value check");

						if (current.next != null) {
							bp.next = current.next;
							bp =  bp.next;
							current =  current.next;
						} else {
							bp.next = null;
							break;
						}

//					} else {
//						current = current.next;
//						bp.next = current;
//					}
						// current.next = current.next.next;
						// current = current.next;
					}
				} else {
					current = current.next;
				}

			}

		}

	}

	public static void addElements(int data) {

		if (head == null) {
			head = new Node(data);
			return;
		} else {

			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new Node(data);

		}

	}

}
