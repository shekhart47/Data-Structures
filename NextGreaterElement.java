package Chapter3;

import java.util.Scanner;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Size of Array1");
		int size1 = input.nextInt();
		input.nextLine();

		int[] array1 = new int[size1];

		for (int i = 0; i < array1.length; i++) {

			System.out.print("Enter Elements of Array " + (i + 1) + " : ");
			array1[i] = input.nextInt();
			input.nextLine();
		}

		System.out.println("Enter Size of Array2");
		int size2 = input.nextInt();
		input.nextLine();

		int[] array2 = new int[size2];

		for (int i = 0; i < array2.length; i++) {

			System.out.print("Enter Elements of Array " + (i + 1) +  " : ");
			array2[i] = input.nextInt();
			input.nextLine();
		}

		nextGreaterElement(array1, array2);

	}

	public static void nextGreaterElement(int[] s1, int[] s2) {

		int k = 0;
		int j = 0;
		int[] s3 = new int[s1.length];

		while (k < s1.length) {

			for (int i = 0; i< s2.length;i++) {
				if (s2[i] == s1[k]) {
					break;
				}

				j = j + 1;
			}

			
			System.out.println("Value of j : "  +j);
			if (j == s2.length-1) {
				
				System.out.println("End of Array Reached, insterting -1");
				s3[k] = -1;
			} else {

				if (s2[j + 1] > s1[k]) {
					
					System.out.println("Checking for next element");
					System.out.println("s2[j+1]  : "+ s2[j+1]);
					s3[k] = s2[j + 1];
				} else {
					
					System.out.println("Checking done, insterting -1");
					s3[k] = -1;
				}

			}

			k = k + 1;
			j = 0;
		}

		for (int m : s3) {
			System.out.print(m + " ");
		}

	}

}
