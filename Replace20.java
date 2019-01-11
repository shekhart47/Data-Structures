package r1;

import java.util.Scanner;

public class Replace20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input  =  new Scanner(System.in);
		System.out.println("Enter String :");
		
		String s = input.nextLine();
	
	
	 String x =  s.replaceAll(" ", "%20");
	 int index = 0;
	 
	 for(int i = x.length()-1;i>=0;i--)
	 {
		 if(x.charAt(i) == 'X')
		 {
			 index = i;
			 break;
		 }
	 }
	 
	 System.out.println(x.substring(0, index+1));

	}

}
