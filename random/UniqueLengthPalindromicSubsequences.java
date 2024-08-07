import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//debug kro agr mid = 0 hoga to kya hoga
public class UniqueLengthPalindromicSubsequences {
    public static int countPalindromicSubsequence(String s) {
        // Define an array of characters representing letters from 'a' to 'z'
        char[] letters = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                                    'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 
                                    'w', 'x', 'y', 'z'};

        // Initialize a HashSet for the left characters and a HashMap for the right characters
        Set<Character> left = new HashSet<>();
        Map<Character, Integer> right = new HashMap<>();

        // Populate the right map with the frequency of each character in the given string
        for(char c : s.toCharArray()) {
            right.put(c, right.getOrDefault(c, 0) + 1);
        }

        // Initialize a HashSet to store unique palindromic subsequences
        Set<String> res = new HashSet<>();

        // Iterate through the characters of the string
        for(int mid = 0; mid < s.length(); mid++) {
            char c = s.charAt(mid);

            // Update the right map to exclude the current character
            right.put(c, right.get(c) - 1);
            if (right.get(c) == 0) {
                right.remove(c);
            }

            // Check for palindromic subsequences by combining left, current, and right characters
            for(int i = 0; i < 26; i++) {
                if(left.contains(letters[i]) && right.containsKey(letters[i])) {
                    res.add("" + letters[i] + c + letters[i]);
                }
            }

            // Add the current character to the left set
            left.add(c);
        }

        // Return the count of unique palindromic subsequences
        return res.size();
    }
    public static void main(String[] args) {
        String s = "aabca";
        System.out.println(countPalindromicSubsequence(s));

    }
}
