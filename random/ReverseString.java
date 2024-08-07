public class ReverseString {
    public void reverseString(char[] s) {
        // Initialize two pointers, one at the start of the array and one at the end
        int l=0, r=s.length-1;

        // Continue the loop until the two pointers meet in the middle
        while (l<r) {
            // Store the character at the start pointer in a temporary variable
            char temp = s[l];

            // Swap the character at the start pointer with the character at the end pointer
            s[l++] = s[r];

            // Swap the character at the end pointer with the character from the temporary variable (originally at the start pointer)
            s[r--] = temp;
        }
    }
}