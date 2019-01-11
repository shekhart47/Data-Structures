package r1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayPartitioning1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of n : ");
		int n = input.nextInt();
		input.nextLine();

		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter Elements of the Array : ");

		for (int i = 0; i < 2 * n; i++) {

			System.out.println("Enter element " + (i + 1) + " : ");
			int data = input.nextInt();
			input.nextLine();
			list.add(data);

		}

		Collections.sort(list);

		for (int k : list) {
			System.out.print(k + " ");
		}

		int i = 0;
		int j = i + 1;
		ArrayList<Integer> minimum = new ArrayList<Integer>();
		while (list.size() - 1 - j >= 0) {

			minimum.add(Math.min(list.get(i), list.get(j)));

			i = i + 2;
			j = i + 1;

		}
		int sum = 0;
		for(int l :  minimum) {
			sum = sum+l;
		}
		System.out.println();
		System.out.println("Max Sum : " + sum);
	}

}
