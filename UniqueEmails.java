package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;

public class UniqueEmails {

	
	
	public int numUniqueEmails(String[] emails) {
		int count = 0;
		
		HashMap<String,Integer> store  =  new HashMap<String,Integer>();

		for (int i = 0; i < emails.length; i++) {
			String x = checkforValidation(emails[i]);
			if(store.containsKey(x)) {
				int value = store.get(x);
				store.put(x, value+1);
			}else {
				store.put(x, 1);
			}
		}
		
		
		count = store.size(); 

		return count;

	}

	public static String checkforValidation(String email) {

		String[] substring = email.split("@");

		char[] prefix = substring[0].toCharArray();
		ArrayList<String> p = new ArrayList<String>();

		for (int i = 0; i < prefix.length; i++) {
			if (!Character.toString(prefix[i]).equals(".")) {

				p.add(Character.toString(prefix[i]));

			} else {
				continue;
			}
		}

		String first = "";
		for (String s : p) {
			first += s;

		}

		String result = "";
		if (first.contains("+")) {

			result = result + first.substring(0, first.indexOf("+"));
			
		} else {
			result += first;

		}
		

		result += "@"+substring[1];
		//System.out.println(result);
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] g = { "test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		UniqueEmails obj =  new UniqueEmails();
		
		
		int c = obj.numUniqueEmails(g);
		
		System.out.println(c);
		
		
		}

	}


