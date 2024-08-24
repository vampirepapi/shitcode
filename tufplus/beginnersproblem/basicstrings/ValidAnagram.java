package tufplus.beginnersproblem.basicstrings;

import java.util.Arrays;

public class ValidAnagram {
	public boolean anagramStrings(String s, String t) {
		if (s.length() != t.length()) return false;
		
		char[] sCharArray = s.toCharArray();
		char[] tCharArray = t.toCharArray();

		Arrays.sort(sCharArray);
		Arrays.sort(tCharArray);

		return Arrays.equals(sCharArray, tCharArray);
    }
  
}
