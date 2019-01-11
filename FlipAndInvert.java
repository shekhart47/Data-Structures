package r1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FlipAndInvert {

	static int rows = 0;
	static int columns = 0;
	static int matrix[][] = new int[rows][columns];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the dimensions of the array : ");

		System.out.println("Enter # of Rows  : ");
		rows = input.nextInt();
		input.nextLine();

		System.out.println("Enter # of Columns  : ");
		columns = input.nextInt();
		input.nextLine();

		matrix = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {

				System.out.print("Enter [" + i + "][" + j + "] : ");
				int data = input.nextInt();
				input.nextLine();

				if (data == 0 || data == 1) {
					matrix[i][j] = data;
				} else {
					System.out.println("Enter Binary Format");
				}

			}
		}

		print();

		for (int i = 0; i < rows; i++) {
			ArrayList<Integer> store = new ArrayList<Integer>();
			for (int j = 0; j < columns; j++) {
				store.add(matrix[i][j]);
			}
			// System.out.println("List Size Passed : " + store.size());

			// swap(store, i);

			Collections.reverse(store);
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = store.get(j);
			}

		}
		System.out.println("Flipped Image : ");
		invert();
		print();

	}

	public static void print() {

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j]);

				if (j == columns - 1) {
					System.out.println();
				}
			}
		}

	}

	public static void invert() {

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {

				if (matrix[i][j] == 0) {
					matrix[i][j] = 1;
				} else {
					matrix[i][j] = 0;
				}
			}
		}

	}

}
