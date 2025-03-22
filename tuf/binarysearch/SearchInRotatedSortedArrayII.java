package tuf.binarysearch;

import java.util.ArrayList;

public class SearchInRotatedSortedArrayII {
    public boolean searchInARotatedSortedArrayII(ArrayList<Integer> nums, int k) {
        for (int num : nums) {
            if (num == k) {
                return true;
            }
        }
        return false; 
    }
}
