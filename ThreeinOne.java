package Chapter3;

import java.util.Scanner;

public class ThreeinOne {

	static int[] MotherArray = new int[6];
	static int start_1 = 0;
	static int end_1 = 0;

	static int start_2 = 0;
	static int end_2 = 0;

	static int start_3 = 0;
	static int end_3 = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int length = (MotherArray.length / 3);

		start_1 = 0;
		end_1 = length - 1;

		start_2 = length;
		end_2 = (2 * length) - 1;

		start_3 = 2 * length;
		end_3 = (3 * length) - 1;

		// index 1 : [0...length-1]

		for (int i = 0; i <= length - 1; i++) {
			MotherArray[i] = 0;
		}

		for (int i = length; i <= 2 * length - 1; i++) {
			MotherArray[i] = 0;
		}

		for (int i = 2 * length; i <= 3 * length - 1; i++) {
			MotherArray[i] = 0;
		}

		System.out.println("Array Elements");
		for (int i : MotherArray) {
			System.out.print(i + " ");
		}

		System.out.println();

		Scanner input = new Scanner(System.in);

		int data = 0;

		for (int i = 0; i < MotherArray.length; i++) {
			System.out.println("Enter Data : ");
			data = input.nextInt();
			input.nextLine();

			System.out.println("Choose Stack : ");
			int stack_number = input.nextInt();

			input.nextLine();



			boolean flag = fillElements(data, stack_number);
			if(flag) {
			System.out.println("storage full for " + stack_number);
			}
		}

		System.out.println("Array Elements");
		for (int i : MotherArray) {
			System.out.print(i + " ");
		}

	}

	public static boolean fillElements(int data, int stack_number) {

		boolean storage_full = false;


		switch (stack_number) {

		case 1:
			if (start_1 <= end_1) {
				
				System.out.println("Current start_1 at : " + start_1);

				MotherArray[start_1] = data;
				start_1 = start_1 + 1;
				storage_full = false;

			}

			if (start_1 > end_1) {
				storage_full = true;
			}
			break;

		case 2:
			if (start_2 <= end_2) {

				System.out.println("Current start_2 at" + start_2);
				MotherArray[start_2] = data;
				start_2 = start_2 + 1;
				storage_full = false;

			}

			if (start_2 > end_2) {
				storage_full = true;
			}
			break;

		case 3:
			if (start_3 <= end_3) {

				System.out.println("Current start_3 at" + start_3);
				MotherArray[start_3] = data;
				start_3 = start_3 + 1;
				storage_full = false;

			}

			if (start_3 > end_3) {
				storage_full = true;
			}
			break;

		}

		return storage_full;

	}

}
