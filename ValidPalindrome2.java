public class ValidPalindrome2 {

    public static boolean validPalindrome(String s) {
        //iterate through the loop
        for (int i = 0; i < s.length(); i++) {
            //create a new SB modString and delete a char from it
            StringBuilder modString = new StringBuilder(s);
            modString.deleteCharAt(i);
            //check if the mod string is palindrome
            if (isPalindrome(modString.toString())) {
                return true;
            }

        }
        return false;
    }

    private static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "racecbar";
        System.out.println(validPalindrome(s));
    }
}
