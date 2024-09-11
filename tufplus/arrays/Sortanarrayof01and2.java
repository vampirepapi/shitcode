package tufplus.arrays;

public class Sortanarrayof01and2 {
    public void sortZeroOneTwo(int[] nums) {
        // count the number of 0, 1, 2
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i : nums) {
            if (i == 0) {
                count0++;
            } else if (i == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        // fill the array with 0, 1, 2
        for (int i = 0; i < count0; i++) {
            nums[i] = 0;
        }
        for (int i = count0; i < count0 + count1; i++) {
            nums[i] = 1;
        }
        for (int i = count0 + count1; i < count0 + count1 + count2; i++) {
            nums[i] = 2;
        }
    }
    
}
