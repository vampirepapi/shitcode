package tuf.binarysearch;

import java.util.Arrays;

public class FindTheSmallestDivisor {
    public static int smallestDivisor(int[] nums, int limit) {
        int ans = -1;
        int maxValue = Arrays.stream(nums).max().orElse(1); // Calculate a more reasonable upper bound based on the maximum value in the array.
        
        // Outer loop: Increment 'i' to find the smallest divisor.
        // The loop now uses 'maxValue' as the upper bound to avoid an infinite or excessively long loop.
        for (double i = 1; i <= maxValue; i++) {
            int sum = 0;
            
            // Inner loop: Calculate the sum of ceilings of nums[i] divided by the current divisor 'i'.
            // This logic could be extracted into a helper function for better modularity.
            for (double j : nums) {
                sum += (int)(Math.ceil((double)(j / i))); // Type conversion to double and back to int may introduce overhead.
            }
            
            // Check if the calculated sum is within the limit.
            if (sum <= limit) {
                ans = (int)i;
                break;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] nums = {8, 4, 2, 3};
        int limit = 4;
        System.out.println(smallestDivisor(nums, limit));
    }
}