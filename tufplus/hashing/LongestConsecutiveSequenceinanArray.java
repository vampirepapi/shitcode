package tufplus.hashing;

import java.util.Arrays;

public class LongestConsecutiveSequenceinanArray {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        // sort the array
        Arrays.sort(nums);

        // init the counter
        int count = 1;
        // init the max counter
        int maxCount = 1;

        // iterate over the array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                count++;
            } else if (nums[i] != nums[i - 1]) {
                count = 1;
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequenceinanArray lcs = new LongestConsecutiveSequenceinanArray();
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(lcs.longestConsecutive(nums)); // Output should be 4
    }
}