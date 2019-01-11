package r1;

import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter First String : ");
		String s1 =  input.nextLine();
		
		s1 =  s1+s1;

		System.out.println("Enter Second String : ");
		String s2 =  input.nextLine();
		
		
		boolean flag = isSubstring(s1,s2);
		
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		

	}

	
	public static boolean isSubstring(String s1, String s2) {
		
		boolean flag = false;
		if(s1.contains(s2))
		{
			flag = true;
		}
		
		return flag;
		
	}
	
	
}
