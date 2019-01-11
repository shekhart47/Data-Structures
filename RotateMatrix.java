package r1;

import java.util.Scanner;

public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N;
		System.out.println("Enter the value of N for (N X N) matrix : ");
		Scanner input = new Scanner(System.in);

		N = input.nextInt();
		input.nextLine();

		int[][] matrix = new int[N][N];

		System.out.println("Enter the elements of the matrix  :");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("matrix[" + i + "]" + "[" + j + "] : ");
				matrix[i][j] = input.nextInt();
				input.nextLine();

				System.out.println();

			}
		}

		System.out.println("Original Matrix : ");

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {

				System.out.print(matrix[i][j] + " ");
				if (j == N - 1) {
					System.out.println();
				}

			}
		}

		int[][] transposed = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {

				transposed[j][i] = matrix[j][i];
				// System.out.print(transposed[j][i] + " ");

//				if (j == N - 1) {
//
//					System.out.println();
//
//				}
			}
		}

		int p1 = 0;
		int p2 = 0;
		int count = 0;

		for (int j = 0; j < N; j++) {
			for (int i = 0; i < N; i++) {
				p1 = transposed[j][i];
				p2 = transposed[j][N - 1 - i];

				if (N % 2 == 1) {

					if (p1 == p2) {
						break;
					} else {
						int temp = p1;
						p1 = p2;
						p2 = temp;

						transposed[j][i] = p1;
						transposed[j][N - 1 - i] = p2;
					}

				} else {

					if (count == (N / 2)) {
						continue;
					}

					int temp = p1;
					p1 = p2;
					p2 = temp;

					transposed[j][i] = p1;
					transposed[j][N - 1 - i] = p2;
					count = count + 1;

				}

			}

			count = 0;
		}

		System.out.println("Rotated Matrix : ");

		for (int j = 0; j < N; j++) {
			for (int i = 0; i < N; i++) {

				System.out.print(transposed[i][j] + " ");

				if (i == N - 1) {

					System.out.println();

				}
			}
		}

	}

}
