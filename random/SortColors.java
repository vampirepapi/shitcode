class SortColors {
    // Method to sort an array of colors (0s, 1s, and 2s)
    public void sortColors(int[] nums) {
        // Initialize three pointers: low, mid, and high
        int low = 0, mid = 0, high = nums.length - 1;

        // Iterate through each element of the nums array
        while (mid <= high) {
            // If the current element is 0
            if (nums[mid] == 0) {
                // Swap nums[low] and nums[mid], and move both low and mid pointers forward
                swap(nums, low, mid);
                low++;
                mid++;
            }
            // If the current element is 1
            else if (nums[mid] == 1) {
                // Move the mid pointer forward
                mid++;
            }
            // If the current element is 2
            else {
                // Swap nums[mid] and nums[high], and move the high pointer backward
                swap(nums, mid, high);
                high--;
            }
        }
    }

    // Swapper method to swap elements at indices x and y in the array nums
    private void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
