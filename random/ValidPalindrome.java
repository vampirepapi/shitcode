public class ValidPalindrome {
    // Method to check if a given string is a palindrome
    public static boolean isPalindrome(String s) {
        // Initialize two pointers, one starting from the left and the other from the right
        int leftPtr = 0, rightPtr = s.length() - 1;

        // Continue the loop until the left pointer crosses the right pointer
        while (leftPtr < rightPtr) {
            // Get the characters at the current positions of the pointers
            char start = s.charAt(leftPtr);
            char end = s.charAt(rightPtr);

            // Skip non-alphanumeric characters from the left side
            if (!isAlphanumeric(start)) {
                leftPtr++;
                continue;
            }

            // Skip non-alphanumeric characters from the right side
            if (!isAlphanumeric(end)) {
                rightPtr--;
                continue;
            }

            // Compare the characters (ignoring case) at the current positions
            if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
                // If characters are not equal, the string is not a palindrome
                return false;
            }

            // Move the pointers towards each other
            leftPtr++;
            rightPtr--;
        }

        // If the loop completes without finding any non-matching characters, the string is a palindrome
        return true;
    }
    public static boolean isAlphanumeric(char c) {
        if (c>= 'A' && c<='Z' || c>= 'a' && c<='z' || c>= '0' && c<= '9') {
            return true;
        }
        return false;
        
    }

    // Main method for testing the isPalindrome function
    public static void main(String[] args) {
        // Example usage with the given string
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
}
