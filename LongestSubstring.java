package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubstring {

	public static int lengthOfLongestSubstring(String s) {
		int ans = 0;
		int n = s.length();
		
		HashMap<String,Integer> store = new HashMap<String,Integer>();
		
		
		for(int j = 0, i = 0; j <n;j++)
		{
			if(store.containsKey(Character.toString(s.charAt(j)))) {
				i = Math.max(store.get(Character.toString(s.charAt(j))), i);
			}
			
			ans =  Math.max(ans, j-i+1);
			store.put(Character.toString(s.charAt(j)), j+1);
			
		}
		
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String g = " ";
		int c = lengthOfLongestSubstring(g);
		System.out.println(c);

	}

}
