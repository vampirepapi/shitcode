package tufplus.arrays;

public class Removeduplicatesfromsortedarray {
    public int removeDuplicates(int[] nums) {
        // if array is empty, return 0
        if (nums.length == 0) return 0;
        // init i to 0
        int i=0;
        // iterate from 1 to end of array
        for (int j = 1; j < nums.length; j++) {
            // if i-th element is not equal to j-th element, increment i and set i-th element to j-th element
            if (nums[i]!=nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        // return i+1 as length of array
        return i+1;
    }
}