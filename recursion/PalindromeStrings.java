package recursion;

public class PalindromeStrings {
    public static boolean palindromeStrTwoPtr(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (j > i) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean palindromeStr(String str) {
        StringBuilder ansStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            ansStr.append(str.charAt(i));
        }
        System.out.println(ansStr);
        return ansStr.toString().equals(str);
    }

    public static void main(String[] args) {
        boolean palindromeStr = palindromeStr("racecar");
        System.out.println(palindromeStr);
    }
}
