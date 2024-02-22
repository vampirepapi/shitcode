class PivotIndex {
    public int pivotIndex(int[] nums) {
        // Step 1: Calculate the total sum of all elements in the array
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
        
        // Step 2: Iterate through the array to find the pivot index
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            // Calculate the sum of elements to the right of the current index
            int rightSum = totalSum - leftSum - nums[i];
            
            // Step 3: Check if the sum of elements to the left is equal to the sum of elements to the right
            if (leftSum == rightSum) {
                // Step 4: If found, return the current index as the pivot index
                return i;
            }
            
            // Update the sum of elements to the left for the next iteration
            leftSum += nums[i];
        }
        
        // Step 5: If no pivot index is found, return -1
        return -1;
    }
}
