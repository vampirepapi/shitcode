package tufplus.beginnersproblem.basicstrings;

import java.util.Arrays;

public class Longestcommonprefix {
	public String longestCommonPrefix(String[] str) {
		String ans="";
		Arrays.sort(str);
		String firstStr=str[0];
		String lastStr=str[str.length-1];
		for (int i = 0; i < Math.min(firstStr.length(), lastStr.length()); i++) {
			if (firstStr.charAt(i) != lastStr.charAt(i)) {
				ans=firstStr.substring(0, i);
			}
		}
		return ans.isEmpty()?"":ans;
    }
	public static void main(String[] args) {
		String[] str = {"flowers" , "flow" , "fly", "flight"};
		Longestcommonprefix obj = new  Longestcommonprefix();
		String longestCommonPrefix = obj.longestCommonPrefix(str);
		System.out.println(longestCommonPrefix);
	}
	
}
