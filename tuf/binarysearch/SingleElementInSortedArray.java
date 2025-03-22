package tuf.binarysearch;

public class SingleElementInSortedArray {
    public int singleNonDuplicate(int[] nums) {
        // as we know here dups exist so we can apply xor
        int ans = 0;
        for (int i : nums) {
            ans = ans ^ i;
        }
        return ans;
    }

    public int solutionTwo(int[] nums) {
        int n = nums.length;

        // if n==1, return the first element
        if (n == 1) return nums[0];
        
        //traverse through the arr to find the single ele
        for (int i = 0; i < nums.length; i++) {
            //check for the first index
            if (i == 0) {
                if (nums[i] != nums[i+1]) {
                    return nums[i];
                }
            }

            //check for the last index
            else if (i == n-1) {
                if (nums[i] != nums[i-1]) {
                    return nums[i];
                }
            }

            //check for other indices
            else{
                if (nums[i] != nums[i-1] && nums[i] != nums[i+1]) {
                    return nums[i];
                }
            }

        }
        return -1;
    }
}
