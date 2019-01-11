package Chapter2;

import java.util.Scanner;

public class MergeLists {

	static Node head1;
	static Node head2;
	static Node head3;
	static Node current3 = head3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("Enter Data for List 1 :");

			int data = input.nextInt();
			input.nextLine();
			if (data > 0) {
				head1 = addElements(head1, data);
			} else {
				break;
			}

		}

		displayList(head1);
		System.out.println();
		while (true) {

			System.out.println("Enter Data for List 2 :");

			int data = input.nextInt();
			input.nextLine();
			if (data > 0) {
				head2=  addElements(head2, data);
			} else {
				break;
			}

		}
		displayList(head2);
		System.out.println();

		mergeList(head1, head2);
		
		displayList(head3);
	}
	
	
	public static void displayList(Node head) {
		
		Node current =  head;
		
		while(current.next!=null) {
			System.out.print(current.data + " ");
			current =  current.next;
		}
		
		System.out.print(current.data + " ");
		
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

	public static void mergeList(Node head1, Node head2) {

		Node p1 = head1;
		Node p2 = head2;

		while (p1 != null && p2 != null) {
			if (p1.data <= p2.data) {
				
				
				//System.out.println("inside first if : p1.data <= p2.data");
				
				
				if (head3 == null) {
					
					//System.out.println("inside IF head3  == null");
					head3 = new Node(p1.data);
					
				} else {

					
					//System.out.println("inside first else");
					current3 = head3;
					while (current3.next != null) {
						current3 = current3.next;
					}
					current3.next = new Node(p1.data);
				}
				
				p1 =  p1.next;
				

			} else {
				
				//System.out.println("inside second if : p2.data <= p1.data");
				
				if (head3 == null) {
					
					//System.out.println("inside ELSE head3  == null");
					head3 = new Node(p2.data);
					
				} else {
					
					//System.out.println("inside second else");

					current3 = head3;
					while (current3.next != null) {
						current3 = current3.next;
					}
					current3.next = new Node(p2.data);
				}
				
				p2 = p2.next;

			}
		}
		
//		if(p1.data <= p2.data) {
//			current3.next = new Node(p1.data);
//			current3 = current3.next;
//			current3.next = new Node(p2.data);
//					
//		}else {
//			current3.next = new Node(p2.data);
//			current3 = current3.next;
//			current3.next = new Node(p1.data);
//			
//		}
//		
		
		if(p1 != null)
		{
			current3.next =  new Node(p1.data);
		}else {
			current3.next =  new Node(p2.data);
		}
		current3 =  head3;

	}
}
