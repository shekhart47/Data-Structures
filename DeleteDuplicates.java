package Chapter2;

import java.util.Scanner;

public class DeleteDuplicates {

	static Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("Enter Data for List :");

			int data = input.nextInt();
			input.nextLine();
			if (data > 0) {
				head = addElements(head, data);
			} else {
				break;
			}

		}
		
		displayList(head);

		deleteDuplicates(head);
		System.out.println();
		System.out.println("Deleted Duplicates");
		System.out.println();
		displayList(head);
	}
	
	public static void deleteDuplicates(Node head) {
		
		Node bp =  head;
		Node fp =  head.next;
		
		
		while(fp.next!=null) {
			
			
			
			if(bp.data ==  fp.data) {
				
				bp.next =  bp.next.next;
				fp =  fp.next;
			}else {
				bp =  bp.next;
				fp = fp.next;
			}
		}
		
		if(bp.data == fp.data) {
			bp.next= null;
		}
		
	}

	public static void displayList(Node head) {

		Node current = head;

		while (current.next != null) {
			System.out.print(current.data + " ");
			current = current.next;
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

}
