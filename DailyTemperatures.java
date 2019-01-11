package Chapter3;

import java.util.Scanner;

public class DailyTemperatures {

	static int size2 = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Array Size : ");
		int size = input.nextInt();
		size2 = size;
		input.nextLine();

		int[] dailyTemp = new int[size];

		for (int i = 0; i < dailyTemp.length; i++) {

			System.out.print("Temp " + (i + 1) + " : ");

			dailyTemp[i] = input.nextInt();
			input.nextLine();
			System.out.println();
		}

		findWaitTime(dailyTemp);

	}

	public static void findWaitTime(int[] dailyTemp) {

		int waitTime[] = new int[size2];

		int p1 = 0;
		int p2 = p1 + 1;

		while (p2 <= dailyTemp.length - 1) {

			if (dailyTemp[p2] > dailyTemp[p1]) {
				
				waitTime[p1] = p2-p1;
				
				p1 = p1+1;
				p2 = p1+1;

			}else {
				p2 = p2+1;
				
				
				if(p2 == dailyTemp.length ) {
					
					p2 = p2-1;
					waitTime[p1] = 0;
					
					if(dailyTemp.length - p1 == 2) {
						waitTime[p2] = 0;
					}
					p1 = p1+1;
					p2 = p1+1;
					
				}
				
			}
		}
		
		
		
		
		
		for(int j : waitTime) {
			System.out.print(j + " ");
		}

	}

}
