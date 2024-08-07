package sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public static void merge(int[] nums, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        List<Integer> ans = new ArrayList<>();
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                ans.add(nums[left]);
                left++;
            } else {
                ans.add(nums[right]);
                right++;
            }
        }
        while (left <= mid) {
            ans.add(nums[left]);
            left++;
        }
        while (right <= high) {
            ans.add(nums[right]);
            right++;
        }
        // move all elements to the original array
        for (int i = low; i <= high; i++) {
            nums[i] = ans.get(i - low);
        }
    }

    private static void mergeSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1};
        sortArray(nums);
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
