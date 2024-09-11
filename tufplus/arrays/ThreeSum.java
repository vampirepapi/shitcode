package tufplus.arrays;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        // cretae a list to store the result
        List<List<Integer>> res = new ArrayList<>();
        // sort the array
        Arrays.sort(nums);
        // iterate over the array
        for (int i = 0; i < nums.length; i++) {
        // avoiding duplicates
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue;
        }
            int fixVal = nums[i];
            // fixval will be our new target
            int target = -fixVal;
            // two pointer approach
            int left = i + 1;
            int right = nums.length - 1;
            // iterate over the array
            while (left < right) {
                if (nums[left] + nums[right] == target) {
                    res.add(Arrays.asList(fixVal, nums[left], nums[right]));
                    left++;
                    right--;
                }
                else if (nums[left] + nums[right] < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        Set<List<Integer>> ansSet = new HashSet<>(res);
        return new ArrayList<>(ansSet);
    }
    
}
