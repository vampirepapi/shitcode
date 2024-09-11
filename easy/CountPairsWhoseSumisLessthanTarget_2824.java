package easy;

import java.util.Collections;
import java.util.List;

public class CountPairsWhoseSumisLessthanTarget_2824 {
    public int countPairs(List<Integer> nums, int target) {
        int cnt = 0;
        Collections.sort(nums);
        int i = 0, j = nums.size() - 1;

        while (i < j) {
            if (nums.get(i) + nums.get(j) < target) {
                cnt += j - i;
                i++; 
            }
            else j--;
        }
        return cnt;
    }
}
