package tuf.binarysearch;

public class SearchXinSortedArray {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 2,4, 5, 6, 7};
        int target = 7;
        SearchXinSortedArray searchXinSortedArray = new SearchXinSortedArray();
        System.out.println(searchXinSortedArray.search(nums, target));
    }
}
