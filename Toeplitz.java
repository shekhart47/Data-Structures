package r1;

import java.util.ArrayList;
import java.util.Scanner;

public class Toeplitz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter rows : ");
		int rows = input.nextInt();
		input.nextLine();

		System.out.println("Enter columns : ");
		int columns = input.nextInt();

		int[][] array = new int[rows][columns];

		input.nextLine();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println("Enter Element :" + "[" + i + "][" + j + "] : ");
				array[i][j] = input.nextInt();
				input.nextLine();

			}
		}

		boolean flag = checkToeplitz(rows, columns, array);
		if (flag) {
			System.out.println("Toeplitz");
		} else {
			System.out.println("Not Toeplitz");
		}

	}

	public static boolean checkToeplitz(int rows, int columns, int[][] a) {

		ArrayList<Boolean> results = new ArrayList<Boolean>();

		boolean flag = false;

		for (int i = 1; i < rows; i++) {

			for (int j = 1; j < columns; j++) {

				if (i == j) {

					if (a[i - 1][j - 1] == a[i][j]) {
						flag = true;
						results.add(flag);

					} else {
						flag = false;
						results.add(flag);
						break;
					}

				} else {

					if (a[i - 1][j - 1] == a[i][j]) {
						flag = true;
						results.add(flag);
					} else {

						flag = false;
						results.add(flag);
						break;
					}

				}

			}
		}

		boolean status = true;
		for (boolean i : results) {
			status = status && i;
		}
		return status;
	}

}
