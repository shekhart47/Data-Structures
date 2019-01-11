package LeetCode;

import java.util.ArrayList;

public class LongestSequence {

	public static int findLengthOfLCIS(int[] nums) {
		ArrayList<Integer> results = new ArrayList<Integer>();

		int count = 0;
		if (nums.length != 0) {

			int l = nums[0];

			for (int i = 1; i < nums.length; i++) {

				if (l < nums[i]) {
					count += 1;
					results.add(count);

				} else {

					count = 0;
					

				}

				l = nums[i];
				//System.out.println(l);

			}

			count = count + 1;
			results.add(count);

		} else {
			count = 0;
			results.add(count);
		}

		int max = 0;
		for (int i : results) {
			if (max < i) {
				max = i;
			}
			
			//System.out.print("-->" + i);
		}

		return max;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 3, 5, 4, 2, 3, 4, 5 };

		System.out.println("Max : "+findLengthOfLCIS(array));
	}

}
