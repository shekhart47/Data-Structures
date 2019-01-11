package r1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueCharacters {

	
	
	public static void main(String[] args) {
		
		
		
		Scanner input =  new Scanner(System.in);
		System.out.println("Enter String  :");
		
		String s =  input.nextLine();
		
		
		char c[] =  s.toCharArray();
		
		HashMap<String, Integer> store =  new HashMap<String, Integer>();
		
		for(char x :  c) {
			
			
			if(store.containsKey(Character.toString(x))) {
				int v = store.get(Character.toString(x));
				v =  v + 1;
				store.put(Character.toString(x), v);
			}
			else {
				store.put(Character.toString(x), 1);
			}
		}
		
		boolean flag = false;
		for(int value :  store.values()) {
			if(value > 1) {
				flag = true;
			}else{
				
			}
		}
		
		if(flag) {
			System.out.println("Duplicate");
		}else{
			System.out.println("All Unique");
		}
		
				
	}
	
}
