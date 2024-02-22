public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        // Initialize a pointer to the start of the array
        int l=0;
        // Iterate over the array
        for (int r = 0; r < nums.length; r++) {
            // If the current element is not zero
            if (nums[r] != 0) {
                // Swap the current element with the element at the l-th index
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] =temp;
                // Increment the l pointer
                l++;
            }
        }        
    }
    public static void main(String[] args) {
        // Initialize an array
        int [] nums = {0,1,0,3,12};
        // Create a Solution object
        MoveZeroes s = new MoveZeroes();
        // Call the moveZeroes method on the Solution object
        s.moveZeroes(nums);
        // Print the elements of the array
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
    }
}