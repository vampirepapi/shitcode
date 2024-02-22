public class MergeStringAlternately {
    public String mergeAlternately(String word1, String word2) { 
        // Create a StringBuilder to build the merged string
        StringBuilder modStr = new StringBuilder();

        // Initialize two pointers, one for each word
        int l=0, r=0;

        // Continue the loop until we reach the end of one of the words
        while (l<word1.length() && r<word2.length()) {
            // Append the character at the current position from word1 to the merged string
            modStr.append(word1.charAt(l));

            // Append the character at the current position from word2 to the merged string
            modStr.append(word2.charAt(r));

            // Increment both pointers
            l++;
            r++;
        }

        // If there are remaining characters in word1, append them to the merged string
        if (l<word1.length()) {
            modStr.append(word1.substring(l, word1.length()));
        }

        // If there are remaining characters in word2, append them to the merged string
        if (r<word2.length()) {
            modStr.append(word2.substring(r, word2.length()));
        }

        // Convert the StringBuilder to a String and return it
        return modStr.toString();
    }
}