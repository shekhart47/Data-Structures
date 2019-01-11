package r1;

import java.util.Scanner;

public class MakeZero {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Dimensions of the matrix  : ");

		System.out.println("M : ");
		int M = input.nextInt();
		input.nextLine();

		System.out.println("N : ");
		int N = input.nextInt();
		input.nextLine();

		int[][] matrix = new int[M][N];

		System.out.println("Enter elements of the matrix  :");
		for (int i = 0; i < M; i++) {

			for (int j = 0; j < N; j++) {
				System.out.print("Matrix [" + i + "]" + "[" + j + "] : ");
				matrix[i][j] = input.nextInt();
				System.out.println("");
				input.nextLine();

			}
		}

		int[] row = new int[M];
		int[] column = new int[N];

		for (int k = 0; k < M; k++) {
			row[k] = -1;
		}
		for (int k = 0; k < N; k++) {
			column[k] = -1;
		}

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (matrix[i][j] == 0) {
					row[i] = 0;
					column[j] = 0;
				}
			}
		}

		for (int i = 0; i < M; i++) {

			if (row[i] == 0) {
				for (int j = 0; j < N; j++) {
					matrix[i][j] = 0;
				}
			}

		}
		for (int j = 0; j < N; j++) {

			if (column[j] == 0) {
				for (int i = 0; i < M; i++) {
					matrix[i][j] = 0;
				}
			}

		}

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(matrix[i][j] + " ");
				if (j == N - 1) {
					System.out.println();
				}
			}
		}

	}

}
