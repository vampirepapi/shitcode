package tufplus.beginnersproblem.basicstrings;

public class Largestumberinastring {    
    public String largeOddNum(String s) {
        String ans = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.getNumericValue(s.charAt(i)) % 2 == 1) {  // Check if the digit is odd
                ans = s.substring(0, i + 1);
                break;  // No need to check further once the largest odd number is found
            }
        }

        // Remove leading zeros, if any
        if (!ans.isEmpty() && ans.charAt(0) == '0') {
            for (int j = 0; j < ans.length(); j++) {
                if (ans.charAt(j) != '0') {
                    return ans.substring(j);
                }
            }
        }

        return ans.isEmpty() ? "" : ans;  // Return the result or an empty string if no odd digit found
    }
}
