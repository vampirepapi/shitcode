public class MergeTwoSortedArr {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Define the last index of the merged array
        int lastIdx = m + n - 1;

        // While there are elements in both arrays
        while (m > 0 && n > 0) {
            // If the last element of nums1 is greater than the last element of nums2
            if (nums1[m - 1] > nums2[n - 1]) {
                // Place the last element of nums1 at the end of the merged array
                nums1[lastIdx] = nums1[m - 1];
                // Decrease the count of elements in nums1
                m--;
            } else {
                // Place the last element of nums2 at the end of the merged array
                nums1[lastIdx] = nums2[n - 1];
                // Decrease the count of elements in nums2
                n--;
            }
            // Move to the next position in the merged array
            lastIdx--;
        }

        // If there are still elements in nums2
        while (n > 0) {
            // Place the remaining elements of nums2 in the merged array
            nums1[lastIdx] = nums2[n - 1];
            // Decrease the count of elements in nums2
            n--;
            // Move to the next position in the merged array
            lastIdx--;
        }
    }
}