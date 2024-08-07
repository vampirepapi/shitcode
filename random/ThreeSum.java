import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        // Step 1: Sort the input array
        Arrays.sort(nums);
        // Step 2: Initialize a list to store the unique triplets
        List<List<Integer>> ansList = new ArrayList<>();
        
        // Step 3: Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Step 4: Skip duplicates of the first element in the triplet
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // Step 5: Fix the first element of the triplet
            int fixVal = nums[i];
            int newTarget = -fixVal;
            int p1 = i + 1;
            int p2 = nums.length - 1;
            
            // Step 6: Use two pointers approach to find pairs that sum up to newTarget
            while (p2 > p1) {
                int currSum = nums[p1] + nums[p2];
                
                // Step 7: Adjust pointers based on current sum
                if (currSum > newTarget) {
                    p2--;
                } else if (currSum < newTarget) {
                    p1++;
                } else {
                    // Step 8: Add the triplet to the result list
                    List<Integer> triplet = Arrays.asList(nums[p1], nums[p2], fixVal);
                    ansList.add(triplet);
                    p1++;
                    p2--;
                }
            }
        }

        // Step 9: Convert the list of lists to a set of lists to remove duplicates
        Set<List<Integer>> ansSet = new HashSet<>(ansList);

        // Step 10: Convert the set back to a list and return the result
        return new ArrayList<>(ansSet);
    }

    public static void main(String[] args) {
        // Step 11: Create an instance of the Solution class
        ThreeSum solution = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        // Step 12: Call the threeSum method and print the result
        List<List<Integer>> result = solution.threeSum(nums);
        System.out.println(result);
    }
}
