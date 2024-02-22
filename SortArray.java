class SortArray {
    public int[] sortArray(int[] nums) {
        // We have to sort the nums array in O(n log n) time complexity
        // Call the mergeSort function to apply the divide and conquer approach
        mergeSort(nums, 0, nums.length - 1);
        
        return nums;
    }

    // Merge Sort Function
    private void mergeSort(int[] nums, int start, int end) {
        // If there is only 1 element in the array, it is already sorted
        if (start < end) {
            // Calculate the middle index
            int mid = (start + end) / 2;
            
            // Call mergeSort for subproblems (left and right halves)
            mergeSort(nums, start, mid);
            mergeSort(nums, mid + 1, end);
            
            // Call the final merge to merge all the elements in place
            merge(nums, start, mid, end);
        }
    }

    // Merge Function
    private void merge(int[] nums, int start, int mid, int end) {
        // Initialize a temporary array to store the merged subarrays
        int[] temp = new int[end - start + 1];
        
        // Initialize indices for left subarray, right subarray, and temporary array
        int i = start, j = mid + 1, k = 0;
        
        // Start iterating and do comparison, storing the smaller element in the temporary array
        while (i <= mid && j <= end) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        
        // Copy the remaining elements from the left subarray to the temporary array
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        
        // Copy the remaining elements from the right subarray to the temporary array
        while (j <= end) {
            temp[k++] = nums[j++];
        }
        
        // Copy the merged subarray from the temporary array back to the original array
        for (int k2 = 0; k2 < temp.length; k2++) {
            nums[start + k2] = temp[k2];
        }
    }
}
