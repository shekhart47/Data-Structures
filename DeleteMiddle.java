package Chapter2;

public class DeleteMiddle {

	static Node head;
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addElements(1);
		addElements(2);
		addElements(2);
		addElements(4);
		addElements(6);
		addElements(11);
		addElements(12);
		addElements(14);
		addElements(19);

		// System.out.println(count);

		displayElements();

		int middle = count / 2 + 1;

		//System.out.println(middle);
		System.out.println("Middle Element : " + deleteMiddle(middle));
		displayElements();

	}

	public static void displayElements() {

		Node current = head;

		while (current.next != null) {
			System.out.print(current.data + "-->");

			count = count + 1;
			current = current.next;
		}

		System.out.println(current.data);
		count = count + 1;
	}

	public static int deleteMiddle(int middle_index) {
		int element = 0;
		int pointer_index = 1;
		Node current =  head;
		
		while(current.next!=null) {
			if(middle_index-pointer_index == 1) {
				
				element = current.next.data;
				current.next = current.next.next;
				break;
			}else {
				current =  current.next;
				pointer_index +=1;
			}
		}
		
		return element;
	}
	
	
	public static void addElements(int data) {

		if (head == null) {
			head = new Node(data);
			// count += 1;
			// System.out.println(count);
			return;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;

				// count +=1;

			}

			current.next = new Node(data);
			// count +=1;

		}

		// System.out.println(count);

	}

}
