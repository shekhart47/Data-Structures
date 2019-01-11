package Chapter2;

import java.util.ArrayList;

public class CheckPalindrome {

	static Node head;

	static int length;

	static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addElements(0);
		addElements(1);
		addElements(2);
		addElements(2);
		addElements(2);
		addElements(0);

		displayElements();

		
		System.out.println("Length : "+ length);
		
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(length-1));
		
		System.out.println();
		boolean flag = checkPalindrome(length);

		if (flag) {
			System.out.println("Paliondrome");
		} else {
			System.out.println("Not Paliondrome");
		}

	}

	public static void displayElements() {

		Node current = head;
		while (current.next != null) {
			System.out.println(current.data);
			list.add(current.data);
			current = current.next;
			length = length + 1;
			
		}

		System.out.println(current.data);
		list.add(current.data);
		length = length + 1;

	}

	public static boolean checkPalindrome(int length) {

		int i = 0;

		int j = length-1;
		
		

		boolean flag = false;

		if (length % 2 == 1) {

			//System.out.println("Inside Odd");
			while (i != j) {

//				System.out.println("i value : " +  i + " element @ " + i + " : " + list.get(i));
//				System.out.println("j value : " +  j + " element @ " + j + " : " + list.get(j-1));
//				
				
				
				if (list.get(i).equals(list.get(j))) {
					
//					System.out.println("list @ i : " + list.get(i));
//					System.out.println("list @ j : " + list.get(j));
//					
					i = i + 1;
					j = j - 1;
					flag = true;
					
					
				} else {
					
					//System.out.println("Inside else");
					flag = false;
					break;
				}

			}
			
			return flag;

		} else {
			//System.out.println("Inside Even");

			while (j - i != 1) {

				if (list.get(i).equals(list.get(j))) {
					i = i + 1;
					j = j - 1;
					flag = true;
				} else {
					flag = false;
					break;
				}

			}
			
			if(list.get(i).equals(list.get(j))) {
				flag =  true;
			}else {
				flag =  false;
			}

		}

		return flag;

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
