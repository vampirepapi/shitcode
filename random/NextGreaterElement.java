import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NextGreaterElement {

    // Function to find the next greater element for each element in nums1 based on nums2
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Array to store the results
        int[] ans = new int[nums1.length];

        // Map to store the mapping of elements in nums2 to their next greater element
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();

        // Iterate through nums2 to find the next greater element for each element
        for (int i = 0; i < nums2.length; i++) {
            int num2 = nums2[i];
            int greaterElement = -1; // Initialize greaterElement to -1 (default if no greater element is found)

            // Iterate through the elements to the right of num2 in nums2
            for (int j = i + 1; j < nums2.length; j++) {
                // If a greater element is found, update greaterElement and break from the loop
                if (nums2[j] > num2) {
                    greaterElement = nums2[j];
                    break;
                }
            }

            // Store the mapping of num2 to its next greater element in the map
            nextGreaterMap.put(num2, greaterElement);
        }

        // Populate the ans array with the next greater element for each element in nums1
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = nextGreaterMap.get(nums1[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        // Example input arrays
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        // Call the function to find the next greater element for each element in nums1
        int[] result = nextGreaterElement(nums1, nums2);

        // Print the result
        System.out.println(Arrays.toString(result));
    }
}
