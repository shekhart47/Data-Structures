package r1;

import java.util.ArrayList;
import java.util.Scanner;

public class Compress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter String to Compress");
		String s = input.nextLine();

		ArrayList<String> result = new ArrayList<String>();

		int count = 1;
		for (int i = 0; i < s.length() ; i++) {
				//System.out.println(i);
			
				if(i == s.length()-1)
				{
					result.add(Character.toString(s.charAt(i)));
					result.add("" + count);
					break;
				}
					
				
				if (Character.toString(s.charAt(i)).equals(Character.toString(s.charAt(i + 1)))) {
					count += 1;

				} else {
					
					
					//System.out.println("value at " + i + Character.toString(s.charAt(i)));
					
					result.add(Character.toString(s.charAt(i)));
					result.add("" + count);
					count = 1;

				}
				}
				
				
			

		
		System.out.println("Compressed String : ");
		for (String x : result) {
			System.out.print(x);
		}
	}

}
