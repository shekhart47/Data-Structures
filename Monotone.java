package r1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Monotone {

	static ArrayList<Integer> main_list = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Array Dimension : ");
		int size = input.nextInt();
		input.nextLine();

		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter element  [" + i+"] : ");
			array[i] = input.nextInt();
			input.nextLine();

			main_list.add(array[i]);
		}

		boolean flag = false;
		if (array[0] > array[1]) {
			main_list.sort(Collections.reverseOrder());

			for (int i = 0; i < array.length; i++) {
				if (main_list.get(i) == array[i]) {
					flag = true;
				} else {
					flag = false;
				}
			}

		} else {
			Collections.sort(main_list);
			for (int i = 0; i < array.length; i++) {
				if (main_list.get(i) == array[i]) {
					flag = true;
				} else {
					flag = false;
				}
			}
		}

		if (flag) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
