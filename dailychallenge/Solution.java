package dailychallenge;

public class Solution {
	public static int minOperations(String[] logs) {
		int res = 0;
		for (String str : logs) {
			if (str.equals("../")) {
				if (res > 0) {
					res--;
				}
			} else if (str.equals("./")) {
				continue;
			} else {
				res++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		String[] logs = { "d1/", "d2/", "./", "d3/", "../", "d31/" };
		System.out.println(minOperations(logs));
	}
}