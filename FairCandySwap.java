package r1;

import java.util.Scanner;

public class FairCandySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter A1 Size : ");
		int size1 = input.nextInt();
		input.nextLine();

		int[] A1 = new int[size1];

		for (int i = 0; i < A1.length; i++) {
			System.out.print("A1[" + i + "]: ");
			A1[i] = input.nextInt();
			input.nextLine();
		}

		System.out.println("Enter A2 Size : ");
		int size2 = input.nextInt();
		input.nextLine();

		int[] A2 = new int[size2];

		for (int i = 0; i < A2.length; i++) {
			System.out.print("A2[" + i + "]: ");
			A2[i] = input.nextInt();
			input.nextLine();
		}

		fairCandySwap(A1, A2);
	}

	public static void fairCandySwap(int[] A1, int[] A2) {

		int sum1 = 0;
		int sum2 = 0;
		int[] A3 = new int[2];

		for (int i : A1) {

			sum1 += i;
		}

		for (int i : A2) {

			sum2 += i;
		}

		if (sum2 > sum1) {

			for (int i = 0; i < A1.length; i++) {
				for (int j = 0; j < A2.length; j++) {
					if (A2[j] - A1[i] == 1) {
						A3[0] = A1[i];
						A3[1] = A2[j];
						break;
					}
				}
			}

		} else {
			for (int i = 0; i < A1.length; i++) {
				for (int j = 0; j < A2.length; j++) {
					if (A1[i] - A2[j] == 1) {
						A3[0] = A1[i];
						A3[1] = A2[j];
						break;
					}
				}
			}

		}

		System.out.println("Output");
		for (int k : A3) {
			System.out.print(k + " ");
		}

	}

}
