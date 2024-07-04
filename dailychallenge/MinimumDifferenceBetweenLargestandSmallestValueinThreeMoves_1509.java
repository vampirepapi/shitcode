package dailychallenge;
import java.util.Arrays;

public class MinimumDifferenceBetweenLargestandSmallestValueinThreeMoves_1509 {
    public int minDifference(int[] nums) {
        //if the len of nums arr is <=4,return 0
        if (nums.length <=4) return 0;
        //max value ptr
        int r = Integer.MAX_VALUE;
        //sorting the arr
        Arrays.sort(nums);
        //we need to loop for 4 times
        for(int i=0; i<4; i++){
            r = Math.min(r, nums[nums.length-4+i]-nums[i]);
        }
        return r;
    }
}