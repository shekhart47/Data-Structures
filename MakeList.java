package Chapter2;

import java.util.Scanner;

public class MakeList {

	static Node head;
	
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
/*
		addNodes(1);
		addNodes(2);
		addNodes(3);
		addNodes(4);
		addNodes(5);
		displayNodes()''
	*/	
		System.out.println();
		
		prependNodes(1);
		prependNodes(2);
		prependNodes(3);
		prependNodes(4);
		prependNodes(5);
		
		displayNodes();
		
		System.out.println();
		deleteElements(5);
		displayNodes();
		
		
	}

	private static void deleteElements(int data) {
		// TODO Auto-generated method stub
		
		if(head.data == data)
		{
			head = head.next;
		}
		
		Node current = head;
		while(current.next.data == data)
		{
			current.next =  current.next.next;
		}
		
		
	}

	public static void displayNodes() {
		Node current = head;

		while (current.next != null) {
			System.out.print(current.data + "-->");
			current =  current.next;
		}

		System.out.print(current.data);
	}

	public static void addNodes(int data) {

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
	
	public static void prependNodes(int data) {
		
		if(head == null)
		{
			head =  new Node(data);
			return;
		}
		
		
		Node newhead =  new Node(data);
		newhead.next = head;
		head = newhead;
		
		
		
	}
	
	
	
	
}
