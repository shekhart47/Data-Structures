package Chapter2;

import java.util.Scanner;

public class SumLists {

	static Node head1;
	static Node head2;
	static int result = 0;
	static Node head3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int data = 0;
		while (true) {

			System.out.println("Enter Data :");
			data = input.nextInt();
			input.nextLine();
			if (data == -1) {
				break;
			} else {

				head1 = addElements(head1, data);
			}

		}
		displayElements(head1);
		System.out.println();
		while (true) {

			System.out.println("Enter Data :");
			data = input.nextInt();
			input.nextLine();
			if (data == -1) {
				break;
			} else {

				head2 = addElements(head2, data);
			}

		}
		displayElements(head2);
		
		System.out.println();
		System.out.println();
		System.out.println("Number 1 : ");
		
		int number1 = findNumber(head1);
		System.out.println(number1);
		
		result = 0;
		
		System.out.println();
		System.out.println("Number 2 : ");
		
		int number2 = findNumber(head2);
		System.out.println(number2);
		
		
		int sum =  number1+number2;
		
		
		System.out.println();
		System.out.println("Sum : " + sum);
		
		head3 =  processNumber(head3,sum);
		displayElements(head3);
		
		
	}

	
	public static Node processNumber(Node head, int data) {
		
		while(data!=0) {
			
			if(head == null) {
				head =  new Node(data%10);
				data =  data/10;
				
			}else {
				Node current =  head;
				while(current.next!=null) {
					current =  current.next;
				}
				current.next =  new Node(data%10);
				data =  data/10;
			}
			
			
			
		}
		
		return head;
	}
	
	
	
	public static void displayElements(Node head) {

		Node current = head;

		while (current.next != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}

		System.out.print(current.data + " ");
	}

	public static int findNumber(Node head) {

		
		Node current = head;

		int i = 0;

		while (current.next != null) {
			result = (int) (result + Math.pow(10, i) * current.data);
			i = i + 1;
			current = current.next;
		}

		result = (int) (result + Math.pow(10, i) * current.data);

		return (int) result;

	}

	public static Node addElements(Node head, int data) {

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
