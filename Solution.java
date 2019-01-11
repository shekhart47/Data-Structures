package r1;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
	public int solution(int[] A) {

		int count = 0;
		for (int i = -1; i < A.length; i++) {
			if (isArraySorted(A, i)) {
				count++;
			}
		}
		return count > 0 ? count - 1 : count;
	}

	boolean isArraySorted(int[] arr, int ind) {
		if (arr.length <= 1)
			return true;

		if (ind == -1) {
			for (int i = 1; i < arr.length; i++) {
				if (arr[i - 1] > arr[i]) {
					return false;
				}
			}
			return true;
		}

		for (int i = ind; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}

		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] < arr[i - 1])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		Solution s = new Solution();

		int[] A = { 3, 4, 5, 4 };

		int x = s.solution(A);
		System.out.println(x);
	}

}
