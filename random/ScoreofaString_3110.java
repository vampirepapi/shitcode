package random;

public class ScoreofaString_3110 {
    public int scoreOfString(String s) {
        char[] charArray = s.toCharArray();
        int sum = 0;
        for (int i = 1; i < charArray.length; i++) {
            sum += Math.abs(s.charAt(i) - s.charAt(i - 1));
        }
        return sum;

    }
}