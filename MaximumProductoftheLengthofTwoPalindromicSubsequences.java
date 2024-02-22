//before solving this, i need to know about - 
// string builder
// bit masking
//depth first search
//solve - longest common subsequence

public class MaximumProductoftheLengthofTwoPalindromicSubsequences {
  public static int maxProduct(String s) {
    // Initialize answer variable
    dfs(s, 0, new StringBuilder(), new StringBuilder());
    // Return the final maximum product
    return ans;
  }

  // Variable to store the maximum product
  private static int ans = 0;

  // Depth-First Search (DFS) method to explore all possible combinations
  private static void dfs(final String s, int i, StringBuilder sb1, StringBuilder sb2) {
    // Base case: If the index i reaches the end of the string s
    if (i == s.length()) {
      // Check if both sb1 and sb2 are palindromes
      if (isPalindrome(sb1) && isPalindrome(sb2))
        // Update the maximum product if necessary
        ans = Math.max(ans, sb1.length() * sb2.length());
      return; // Return from the recursive call
    }

    // Save the lengths of sb1 and sb2 before modification
    final int sb1Length = sb1.length();
    final int sb2Length = sb2.length();

    // Recursive call 1: Append the current character to sb1
    dfs(s, i + 1, sb1.append(s.charAt(i)), sb2);
    // Restore the length of sb1 for backtracking
    sb1.setLength(sb1Length);

    // Recursive call 2: Append the current character to sb2
    dfs(s, i + 1, sb1, sb2.append(s.charAt(i)));
    // Restore the length of sb2 for backtracking
    sb2.setLength(sb2Length);

    // Recursive call 3: Skip the current character
    dfs(s, i + 1, sb1, sb2);
  }

  // Helper method to check if a StringBuilder is a palindrome
  private static boolean isPalindrome(StringBuilder sb) {
    int i = 0;
    int j = sb.length() - 1;
    while (i < j) {
      // Compare characters from the beginning and end
      if (sb.charAt(i) != sb.charAt(j))
        return false; // Not a palindrome
      // Move the pointers towards the center
      ++i;
      --j;
    }
    return true; // StringBuilder is a palindrome
  }
  public static void main(String[] args) {
    String  s = "accbcaxxcxx";
    System.out.println(maxProduct(s));
  }
}
