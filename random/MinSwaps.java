public class MinSwaps {
    // Function to calculate the minimum number of swaps
    public static int minSwaps(String s) {
        // Variables to keep track of closing brackets and the maximum count
        int countClosingBrackets = 0, max = 0;

        // Iterate through each character in the input string
        for (char c : s.toCharArray()) {
            // If the character is ']', increment the count of closing brackets
            if (c == ']') {
                countClosingBrackets++;
                // Update the maximum count with the maximum of the current count and the previous maximum
                max = Math.max(max, countClosingBrackets);
            } else {
                // If the character is '[', decrement the count of closing brackets
                countClosingBrackets--;
            }
        }

        // Return the minimum number of swaps needed, considering that each swap involves two brackets
        return (max + 1) / 2;
    }

    public static void main(String[] args) {
        // Example usage
        String s = "[]";
        // Print the result of the minSwaps function for the given input
        System.out.println(minSwaps(s));
    }
}
