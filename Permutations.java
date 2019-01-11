package r1;

import java.util.HashMap;
import java.util.Scanner;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Enter String : ");
		String s =  input.nextLine();
		
		s =  s.toLowerCase();
		
		HashMap<String,Integer> store =  new HashMap<String, Integer>();
		
		for(int i = 0;i<s.length();i++)
		{
			if(store.containsKey(Character.toString(s.charAt(i)))){
				int value = store.get(Character.toString(s.charAt(i)));
				value += 1;
				store.put(Character.toString(s.charAt(i)), value);
			}else {
				store.put(Character.toString(s.charAt(i)), 1);
			}
			
		}
		
		int count = 0;
		for(int i= 0; i< store.size();i++)
		{
			int value = store.get(Character.toString(s.charAt(i)));
			if(value %2 == 0)
			{
				
			}else {
				count = count+1;
			}
		}
		
		
		if(count >1) {
			System.out.println("Not a permutation of Palindrome");
		}else {
			System.out.println("Permutation of Palindrome");
		}


	}
	
	
}
