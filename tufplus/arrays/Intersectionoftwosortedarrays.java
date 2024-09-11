package tufplus.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersectionoftwosortedarrays {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        int[] visitedN2 = new int[nums2.length];

        // Loop through nums1
        for (int x : nums1) {
            // Loop through nums2 with the index j
            for (int j = 0; j < nums2.length; j++) {
                // Check if the element is not visited and is equal
                if (x == nums2[j] && ans.contains(x)) {
                    ans.add(x);
                    visitedN2[j] = 1; // Mark as visited
                    break; // Avoid adding duplicates, move to the next element of nums1
                }
            }
        }

        return ans.stream().mapToInt(Integer::intValue).toArray(); 
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 5};
        int[] nums2 = {1, 2, 7};
        Intersectionoftwosortedarrays obj = new Intersectionoftwosortedarrays();
        int[] result = obj.intersectionArray(nums1, nums2);

        // Printing the array using Arrays.toString()
        System.out.println(Arrays.toString(result));
    }
}
