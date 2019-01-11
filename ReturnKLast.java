package Chapter2;

public class ReturnKLast {

	
	static Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addElements(1);
		addElements(2);
		addElements(3);
		addElements(4);
		addElements(5);
		
		
		
		
		System.out.println("Kth Element : " + returnKElement(10));
		

	}
	
	
	
	public static void addElements(int data) {
		if(head == null) {
			head = new Node(data);
			return;
		}else {
			
			
			Node current =  head;
			while(current.next!=null) {
				current=   current.next;
				
			}
			
			current.next = new Node(data);
			
		}
	}
	
	
	public static int returnKElement(int k) {
		
		int count = 0;
		
		Node current = head;
		
		while(current !=null) {
			
			count += 1;
			current =  current.next;
		}
		//System.out.println(count);
		
		
		int length =  count;
		
		int element_index  = length - k + 1;
		
		if(element_index > 0 && element_index < length) {
		
		Node pointer =  head;
		int index  = 1 ;
		while(pointer!=null) {
		
			if(index != element_index) {
				pointer =  pointer.next;
				index = index  +1;
			}else {
				break;
			}
			
		}
		
		
		return pointer.data;
	}else {
		return 0;
	}
	}

}
