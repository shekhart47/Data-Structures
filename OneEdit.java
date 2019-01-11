package r1;

import java.util.HashMap;
import java.util.Scanner;

public class OneEdit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input =  new Scanner(System.in);
		
		System.out.println("Enter 1st String  :");
		String s1 = input.nextLine();
		System.out.println("Enter 2nd String  :");
		String s2 =  input.nextLine();
		
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		
		for(int i = 0; i< s1.length();i++)
		{
			map.put(Character.toString(s1.charAt(i)), 1);
		}
		
		for(int i = 0; i< s2.length();i++)
		{
			if(map.containsKey(Character.toString(s2.charAt(i)))) {
				int value =  map.get(Character.toString(s2.charAt(i)));
				
				value+=1;
				
				map.put(Character.toString(s2.charAt(i)), value);
			}else {
				map.put(Character.toString(s2.charAt(i)), 1);	
			}
		}
		
		
		int edit = 0;
		for(Integer v : map.values())
		{
			int value = v;
			if(value%2 == 0) {
				
			}else {
				edit += 1;
			}
		}
		
		if(edit > 2) {
			
			System.out.println("Made more than one change");
			
		}else {
			System.out.println("One Edit Away");
		}
		
		
		
		
		for(Integer v : map.values())
		{
			System.out.println(v);
		}
		
	}

}
