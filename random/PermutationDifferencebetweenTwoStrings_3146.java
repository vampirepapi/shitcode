package random;

public class PermutationDifferencebetweenTwoStrings_3146 {
    public static int findPermutationDifference(String s, String t) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            int idx = t.indexOf(Character.toString(charAt));
            sum += Math.abs(i - idx);
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "abcde", t = "edbac";
        System.out.println(findPermutationDifference(s, t));
    }
}