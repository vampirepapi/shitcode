package tufplus.beginnersproblem.basicstrings;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		String str = "Shubham";
		for(int i=0; i<str.length(); i++){
			for(int j=i; j<str.length(); j++){
				System.out.print(str.substring(i, j+1));
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}