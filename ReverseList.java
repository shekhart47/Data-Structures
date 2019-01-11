package Chapter2;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseList {

	static Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int data = 0;

		while (true) {

			System.out.println("Enter data : ");
			data = input.nextInt();
			input.nextLine();

			if (data >= 0) {

				addElements(data);

			} else {
				break;
			}

		}

		reverseList();

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

	public static void reverseList() {

		Node current = head;
		ArrayList<Integer> reversed = new ArrayList<Integer>();

		while (current.next != null) {

			reversed.add(current.data);
			current = current.next;
		}

		reversed.add(current.data);

		reversed = listReverse(reversed);

		int length =  reversed.size();
		
		int i = 0;
		current = head;
		while(current!=null) {
			
			if(i < length) {
				current.data =  reversed.get(i);
				i = i+1;
				current =  current.next;
			}
			
		}
		
		System.out.print("Reversed Linked List : ");
		
		current = head;
		while(current.next!=null) {
			System.out.print(current.data + " ");
			current =  current.next;
		}

		System.out.print(current.data + " Null");
		
	}

	public static ArrayList<Integer> listReverse(ArrayList<Integer> list) {

		
		
		System.out.print("List Elements Entered  : ");
		for (int m : list) {

			System.out.print(m + " ");
		}

		System.out.println();

		int length = list.size();

		int[] reverse = new int[length];
		int i = 0;
		int j = length - 1;

		while (j - i >= 1) {
			int temp = list.get(i);

			reverse[i] = list.get(j);
			reverse[j] = temp;

			i = i + 1;
			j = j - 1;
		}

		
		ArrayList <Integer> newList =  new ArrayList<Integer>();
		for (int k : reverse) {

			newList.add(k);
		}

		return newList;

	}

}
