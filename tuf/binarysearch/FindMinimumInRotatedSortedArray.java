package tuf.binarysearch;

import java.util.ArrayList;

public class FindMinimumInRotatedSortedArray {
    public int findMin(ArrayList<Integer> arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
