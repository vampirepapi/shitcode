package tufplus.sorting;

public class QuickSort {
    
    private int partitionElement(int[] nums, int low, int high) {
        // Choosing the first element as pivot
        int pivot = nums[low];

        //init 2 pointers
        int i = low;
        int j = high;
        
        // Loop till two pointers meet
        while (i<j) {
            // Increment left pointer
            while (nums[i] <= pivot && i<= high-1) {
                i++;
            }

            // Decrement right pointer
            while (nums[j] > pivot && j >= low+1) {
                j--;
            }

            // Swap if pointers meet
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        // Pivot placed in correct position
        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;
        return j;
    }

    private void quickSortAlgo(int[] nums, int low, int high) {
        //base case
        if (low >= high) return;

        //partition
        int pivot = partitionElement(nums, low, high);

        //sort for left part
        quickSortAlgo(nums, low, pivot-1);
        
        //sort for right part
        quickSortAlgo(nums, pivot+1, high);
    }

    public int[] quickSort(int[] nums) {
        quickSortAlgo(nums, 0, nums.length -1);
        return nums;
    }


    
}