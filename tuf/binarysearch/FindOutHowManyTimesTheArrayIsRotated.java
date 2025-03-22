package tuf.binarysearch;

import java.util.ArrayList;

public class FindOutHowManyTimesTheArrayIsRotated {
    public int findKRotation(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size()-1; i++) {
            if (!(nums.get(i) < nums.get(i+1))) {
                return i+1;
            }
        }
        return 0;
    }
}
