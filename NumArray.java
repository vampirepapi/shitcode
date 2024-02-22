class NumArray {

    // Array to store the prefix sums
    public int[] arr;

    // Constructor to initialize the NumArray object with the given array of numbers
    public NumArray(int[] nums) {
        // Initialize the arr array to store prefix sums with the same length as the input array
        arr = new int[nums.length];
        
        // Variable to store the running total while calculating prefix sums
        int total = 0;

        // Iterate through the input array to calculate and store the prefix sums in arr
        for (int i = 0; i < nums.length; i++) {
            // Calculate the running total
            total += nums[i];

            // Store the running total as the prefix sum at the current index in arr
            arr[i] = total;
        }
    }

    // Method to calculate the sum of elements in a given range [left, right]
    public int sumRange(int left, int right) {
        // If left is 0, return the prefix sum at the right index
        if (left == 0) {
            return arr[right];
        }

        // Return the sum of elements in the range [left, right] by subtracting the prefix sum at left-1
        return arr[right] - arr[left - 1];
    }
}
