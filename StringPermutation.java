package r1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input =  new Scanner(System.in);
		
		String s1 = "";
		String s2 = "";
		
		String sorted_s1 = sort(s1);
		String sorted_s2 = sort(s2);
		
		System.out.println(sorted_s1);
		System.out.println(sorted_s2);
		
		if(sorted_s1.equals(sorted_s2))
		{
			System.out.println("Permutation");
		}else {
			System.out.println("Not Permutation");
		}
		
		
		
	}
	
	public static String sort(String s) {
		
		char[] c =  s.toCharArray();
		
		
		ArrayList<String> list =  new ArrayList<String>();
		
		
		for(char x :  c) {
			
			list.add(Character.toString(x));
		}
		
		Collections.sort(list);
		
		StringBuilder sb =  new StringBuilder();
		
		for(String letters :  list) {
			
			sb.append(letters);
			
		}
		
		
		return sb.toString();
		
	}

}
