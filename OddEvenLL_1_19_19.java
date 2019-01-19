package Chapter2;

import java.util.Scanner;

public class OddEvenLL_1_19_19 {

	static Node head;
	static int noe = 0;

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
		// display();

		// System.out.print(noe);
		arrangeElements(noe);
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

	public static void arrangeElements(int length) {

		Node head_odd = head;
		Node head_even = head.next;
		Node p_odd = head_odd;
		Node p_even = head_even;
		int places = length / 2;
		int j = 0;
		int k = 0;

		if (length % 2 == 1) {

			while (true) {
				if (j < places) {
					p_odd.next = p_odd.next.next;
					p_odd = p_odd.next;
					j = j + 1;
				}

				if (k < places - 1) {
					p_even.next = p_even.next.next;
					p_even = p_even.next;
					k = k + 1;
				}

				if (j == places && k == places - 1) {
					p_even.next = null;
					break;
				}
			}

		} else {
			while (true) {
				if (j < places) {
					p_odd.next = p_odd.next.next;
					p_odd = p_odd.next;
					j = j + 1;
				}

				if (k < places) {
					p_even.next = p_even.next.next;
					p_even = p_even.next;
					k = k + 1;
				}

				if (j == places - 1 && k == places - 1) {
					p_even.next = null;
					break;
				}
			}

		}

		p_odd.next = head_even;

	}

	public static void addElements(int data) {

		if (head == null) {
			head = new Node(data);
			noe = noe + 1;
			return;
		} else {
			Node counter = head;
			while (counter.next != null) {
				counter = counter.next;
			}
			counter.next = new Node(data);
			noe += 1;
		}

	}

}
