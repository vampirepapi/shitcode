package tufplus.arrays;

import java.util.ArrayList;
import java.util.List;

public class LeadersinanArray {
    public int[] leaders(int[] nums) {
        // ans list
        List<Integer> ans =  new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            boolean leader = true;

            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader) {
                ans.add(nums[i]);
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
