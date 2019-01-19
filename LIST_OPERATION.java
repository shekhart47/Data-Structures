package r1;

import java.util.ArrayList;

public class LIST_OPERATION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ArrayList<Integer>> main_list = new ArrayList<>();

		ArrayList<Integer> one = new ArrayList<Integer>();
		ArrayList<Integer> two = new ArrayList<Integer>();
		ArrayList<Integer> three = new ArrayList<Integer>();
		ArrayList<Integer> four = new ArrayList<Integer>();

		one.add(1);
		one.add(2);

		two.add(3);
		two.add(4);

		three.add(5);
		three.add(6);

		four.add(7);
		four.add(8);

		main_list.add(one);
		main_list.add(two);
		main_list.add(three);
		main_list.add(four);

		for (int i = 0; i < main_list.size(); i++) {
			for (int j = 0; j < main_list.get(i).size(); j++) {

				System.out.print(main_list.get(i).get(j) + " ");

			}
			System.out.println();
		}

	}

}
