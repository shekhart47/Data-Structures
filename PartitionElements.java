package Chapter2;

import java.util.ArrayList;
import java.util.HashMap;

public class PartitionElements {

	static Node head;
	static ArrayList<Integer> list1 =  new ArrayList<Integer>();
	static ArrayList<Integer> list2 =  new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addElements(3);
		addElements(5);
		addElements(8);
		addElements(5);
		addElements(10);
		addElements(2);
		addElements(1);
		
		
		displayElements();

		int partition = 6;

		partitionElements(partition);

	}
	
	public static void displayElements() {
		
		Node current=  head;
		
		while(current.next!=null) {
			System.out.print(current.data + " ");
			current =  current.next;
		}
		
		System.out.print(current.data);
	}

	public static void partitionElements(int partition) {

		Node current = head;
		while (current.next != null) {

			if (current.data < partition) {
				
				
				list1.add(current.data);

			} else {
				
				list2.add(current.data);
			}

			current = current.next;

		}
		
		if(current.data  < partition)
		{
			list1.add(current.data);
		}else {
			list2.add(current.data);
		}

		System.out.println();
		System.out.println("New List");

		for (int i : list1) {
			System.out.print(i + " ");
		}

		System.out.print("| ");
		System.out.print("| ");
		for (int j : list2) {
			System.out.print(j+ " " );
		}
		
		System.out.print("| ");
		System.out.print("| ");

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
