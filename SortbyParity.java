package r1;

import java.util.ArrayList;
import java.util.Scanner;

public class SortbyParity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Array size : ");

		int size = input.nextInt();
		input.nextLine();

		int array[] = new int[size];

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < size; i++) {

			System.out.print("Enter Element : " + (i + 1) + " : ");
			array[i] = input.nextInt();
			input.nextLine();

			list.add(array[i]);

		}

		int i = 0;
		while (i < array.length) {

			if (i % 2 == 0) {
				// store even element at ith position
				int data = 0;

				for (int e = 0; e < list.size(); e++) {
					if ((list.get(e) % 2) == 0) {
						data = list.get(e);
						list.remove(e);
						break;
					}
				}

				array[i] = data;
				i = i + 1;

			} else {
				// store odd element at ith position

				int data = 0;

				for (int e = 0; e < list.size(); e++) {
					if ((list.get(e) % 2) == 1) {
						data = list.get(e);
						list.remove(e);
						break;
					}
				}

				array[i] = data;
				i = i + 1;

			}

		}
		
		
		for(int k :  array) {
			System.out.print(k + " ");
		}

	}

}
