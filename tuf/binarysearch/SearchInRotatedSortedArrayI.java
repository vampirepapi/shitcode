package tuf.binarysearch;

public class SearchInRotatedSortedArrayI {
    public int search(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
                return i;
            }
        }
       return -1;
    }
}
