package Chapter2;

import java.util.Scanner;

public class Swap_pairs_1_19_19 {

	static Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		while (true) {

			System.out.println("Enter New Element  : ");
			int data = input.nextInt();
			input.nextLine();

			if (data >= 0) {
				addElements(data);
			} else {
				break;
			}

		}

		process();
		display();

	}

	public static void display() {

		int counter = 0;
		Node current = head;
		while (current.next != null) {
			System.out.print(current.data + " ");
			current = current.next;

		}
		System.out.print(current.data + " ");

	}

	public static void process() {

		Node p1 = head;
		head = head.next;

		while (p1.next != null) {
			Node p2 = p1.next;
			Node p3 = p2.next;

			p2.next = p1;
			if (p3 != null) {

				if (p3.next != null) {
					p1.next = p3.next;
				} else {
					p1.next = p3;
				}

				p1 = p3;
			} else {
				p1.next = null;
			}
		}

	}

	public static void addElements(int data) {

		if (head == null) {
			head = new Node(data);

			return;
		} else {
			Node counter = head;
			while (counter.next != null) {
				counter = counter.next;
			}
			counter.next = new Node(data);

		}

	}

}
