package tufplus.arrays;

class Solution {
    public void moveZeroes(int[] nums) {

        // init i to first zero valued element
        int i = -1;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) {
                i = j;
                break;
            }
        }

        // if i is still -1, then no zero element found
        if (i == -1) return;

        // iterate from i+1 to end of array
        for (int j = i + 1; j < nums.length; j++) {
            // if non-zero element found, swap with i
            if (nums[j] != 0) {
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
            }
        }        
    }
}