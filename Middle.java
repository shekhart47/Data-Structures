package Chapter2;

import java.util.Scanner;

public class Middle {

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

		System.out.println(middleElement(head));

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

	public static int middleElement(Node head) {

		Node current = head;
		int counter = 1;
		while (current.next != null) {
			counter = counter + 1;
			current = current.next;
		}

//		System.out.println("List Length  : " + counter);
//		
//		System.out.println("List Elements");
//		
//		Node pointer  =  head;
//		
//		while(pointer != null) {
//			System.out.print(pointer.data + " ");
//			pointer  = pointer.next;
//		}

		int middle = 0;

		int k = counter / 2 + 1;
		int i = 1;
		Node p = head;
		while (i < k) {
			p = p.next;
			i = i + 1;
		}

		middle = p.data;

		return middle;
	}
}
