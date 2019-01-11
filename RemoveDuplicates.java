package Chapter2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RemoveDuplicates {

	static Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addNodes(1);
		
		addNodes(2);
		addNodes(2);
		addNodes(3);
		
		addNodes(4);
		
		deleteDuplicates();
		//displayList();
	}

	public static void displayList() {
		System.out.println("inside display");
		Node current = head;
		while (current.next != null) {
			System.out.print(current.data + "-->");
			current = current.next;
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

	public static void deleteDuplicates() {
		System.out.println("inside delete");

		HashMap<Integer, Integer> store = new HashMap<Integer, Integer>();

		Node current = head;
		
		
		while(current.next!=null) {
			
			if(store.containsKey(current.data)) {
				System.out.println("Yes");
				current  = current.next;
			}else {
				store.put(current.data, 1);
				current  = current.next;
			}
			
			
		}
		
		if(store.containsKey(current.data))
		{
			current = null;
		}else {
			store.put(current.data, 1);
		}

		for(Integer i :  store.keySet()) {
			System.out.print(i + " ");
		}
		
		
	}

}
