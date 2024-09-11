package tufplus.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        //hashmap
        Map<Integer, Integer> map = new HashMap<>();
        
        //iterate through each element
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[] {map.get(diff),i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
    
}
