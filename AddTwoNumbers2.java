package Chapter2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AddTwoNumbers2 {

	static Node head1;
	static Node head2;
	static Node head3;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.print("Enter data to feed into List 1  : ");
			int data = input.nextInt();
			input.nextLine();

			if (data > 0) {
				head1 = addElements(data, head1);

			} else {
				break;
			}

		}

		System.out.println();
		System.out.print("List 1 : ");

		display(head1);
		System.out.println();
		System.out.println();

		while (true) {

			System.out.print("Enter data to feed into List 2  : ");
			int data = input.nextInt();
			input.nextLine();

			if (data > 0) {
				head2 = addElements(data, head2);

			} else {
				break;
			}

		}
		System.out.println();
		System.out.print("List 2 : ");

		display(head2);

		System.out.println();

		padding();

		

		ArrayList<Integer> l3 = addLists();
		
		int i = 0;
		while(i <  l3.size()) {
			
			head3 = addElements(l3.get(i), head3);
			i = i+1;
		}
		
		System.out.println();
		System.out.print("List 3 : ");

		display(head3);


	}

	public static ArrayList<Integer> addLists() {

		Node current1 = head1;
		Node current2 = head2;

		ArrayList<Integer> l1 = new ArrayList<>();

		while (current1 != null) {
			l1.add(current1.data);
			current1 = current1.next;
		}

		Collections.reverse(l1);
		ArrayList<Integer> l2 = new ArrayList<>();

		while (current2 != null) {
			l2.add(current2.data);
			current2 = current2.next;
		}

		Collections.reverse(l2);

		int counter = 0;

		ArrayList<Integer> l3 = new ArrayList<Integer>();
		int carry = 0;
		int n1 = 0;
		int n2 = 0;
		int sum = 0;
		int val = 0;
		for (int i = 0; i < l1.size(); i++) {

			n1 = l1.get(i);
			n2 = l2.get(i);
			sum = n1 + n2 + carry;
			val = sum % 10;

			l3.add(val);

			carry = sum / 10;

		}

		Collections.reverse(l3);

		return l3;
		
		

	}

	public static void padding() {

		Node c1 = head1;
		int lengh_l1 = 0;
		while (c1 != null) {
			c1 = c1.next;
			lengh_l1 = lengh_l1 + 1;
		}

		Node c2 = head2;
		int lengh_l2 = 0;
		while (c2 != null) {
			c2 = c2.next;
			lengh_l2 = lengh_l2 + 1;
		}

		System.out.println(lengh_l1 + ":" + lengh_l2);

		int difference = 0;
		int num_zeros = 0;
		if (lengh_l1 > lengh_l2) {

			difference = lengh_l1 - lengh_l2;
			while (num_zeros < difference) {

				Node current = new Node(0);
				current.next = head2;
				head2 = current;
				num_zeros = num_zeros + 1;

			}

		} else {
			difference = lengh_l2 - lengh_l1;

			while (num_zeros < difference) {

				Node current = new Node(0);
				current.next = head1;
				head1 = current;
				num_zeros = num_zeros + 1;

			}

		}

	}

	public static void display(Node head) {

		Node current = head;
		while (current.next != null) {

			System.out.print(current.data + " ");
			current = current.next;
		}

		System.out.print(current.data);

	}

	public static Node addElements(int data, Node head) {
		if (head == null) {
			head = new Node(data);
			return head;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new Node(data);
		}
		return head;
	}

}
