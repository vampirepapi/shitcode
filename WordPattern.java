import java.util.HashMap;

class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        // Convert string s to string array using space as the delimiter
        String[] sArray = s.split("\\s");

        // Check if the length of the pattern is equal to the length of sArray
        if (pattern.length() != sArray.length) {
            return false;
        }

        // Create two hashmaps to store the mapping between pattern characters and strings, and vice versa
        HashMap<Character, String> h1 = new HashMap<>();
        HashMap<String, Character> h2 = new HashMap<>();

        // Iterate through the arrays
        for (int i = 0; i < sArray.length; i++) {
            // Check if the current pattern character is already in h1, and if the corresponding string is not equal to the current string
            if (h1.containsKey(pattern.charAt(i)) && !h1.get(pattern.charAt(i)).equals(sArray[i])) {
                return false;
            }

            // Check if the current string is already in h2, and if the corresponding pattern character is not equal to the current pattern character
            if (h2.containsKey(sArray[i]) && !h2.get(sArray[i]).equals(pattern.charAt(i))) {
                return false;
            }

            // Update the mappings in both hashmaps
            h1.put(pattern.charAt(i), sArray[i]);
            h2.put(sArray[i], pattern.charAt(i));
        }

        // If all mappings are consistent, return true
        return true;
    }
}
