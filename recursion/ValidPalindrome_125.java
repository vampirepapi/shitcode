package recursion;

public class ValidPalindrome_125 {
    public static boolean isPalindrome(String s) {
        // String newS = s.replaceAll("[^a-zA-Z0-9]", "");
        // System.out.println(newS);
        int left = 0, right = s.length() - 1;
        while (right > left) {
            // System.out.println(Character.toLowerCase(newS.charAt(right)));
            // System.out.println(Character.toLowerCase(newS.charAt(left)));
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if (Character.toLowerCase(s.charAt(right)) == Character.toLowerCase(s.charAt(left))) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
