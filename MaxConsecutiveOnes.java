package r1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int size = input.nextInt();
		input.nextLine();

		int[] array = new int[size];

		for (int i = 0; i < array.length; i++) {
			System.out.print("array[" + i + "] : ");
			array[i] = input.nextInt();
			input.nextLine();

		}

		ArrayList<Integer> maxone = new ArrayList<Integer>();

		int counter = 1;
		for (int i = 0; i < array.length - 1; i++) {

			if (array[i] == 1) {
				if (array[i + 1] == 1) {

					counter = counter + 1;

				} else {
					maxone.add(counter);
					counter = 1;
				}

			} else {
//				continue;
			}

		}

		maxone.add(counter);

		int max = Collections.max(maxone);
		System.out.println(max);

	}

}
