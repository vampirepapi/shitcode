import java.util.HashMap;

public class SubarraySumsEqualsK {
    // Function to find the number of subarrays whose sum equals k
    public int subarraySum(int[] nums, int k) {
        // Initialize variables to keep track of the result and the current sum
        int res = 0, currSum = 0;

        // Create a HashMap to store the frequency of cumulative sums
        HashMap<Integer, Integer> map = new HashMap<>();
        // Initialize the HashMap with one occurrence of 0 (cumulative sum up to index -1)
        map.put(0, 1);

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Update the current sum by adding the current element
            currSum += nums[i];
            
            // Calculate the difference between the current sum and the target sum k
            int diff = currSum - k;

            // Check if the HashMap contains the difference
            if (map.containsKey(diff)) {
                // If yes, update the result by adding the frequency of the difference
                res += map.get(diff);
            }

            // Update the HashMap with the current cumulative sum
            // Increment the count of occurrences or set to 1 if not present
            map.put(currSum, 1 + map.getOrDefault(currSum, 0));
        }

        // Return the final result
        return res;
    }
}
