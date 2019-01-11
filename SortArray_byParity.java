package r1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SortArray_byParity {
	static Queue<Integer> even = new LinkedList<Integer>();
	static Queue<Integer> odd = new LinkedList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Aray Size : ");
		int size = input.nextInt();
		input.nextLine();

		int[] array = new int[size];
		System.out.println("Enter Array Elements : ");
		for (int i = 0; i < size; i++) {
			System.out.print("Element "+ (i+1) + ": ");

			array[i] = input.nextInt();
			input.nextLine();
		}

		int[] x = sortArray(array);
		for (int z : x) {
			System.out.print(z + " ");
		}

	}

	public static int[] sortArray(int[] array) {

		int[] new_array = new int[array.length];

		for (int i : array) {
			if (i % 2 == 0) {
				even.add(i);
			} else {
				odd.add(i);
			}
		}

		int j = 0;

		while (!even.isEmpty()) {
			new_array[j] = even.remove();
			j += 1;
		}
		while (!odd.isEmpty()) {
			new_array[j] = odd.remove();
			j = j + 1;
		}

		return new_array;
	}

}
