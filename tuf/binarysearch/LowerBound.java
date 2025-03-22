package tuf.binarysearch;

/*
 * The lower bound algorithm finds the first or the smallest index in a sorted array where the value at that index is greater than or equal to a given key i.e. x.
 * If no such index is found, return the size of the array.
*/
public class LowerBound {
    
    public int lowerBound(int[] nums, int x) {
        //here we can apply Binary Search, as the data is sorted.
        int i = 0, j = nums.length-1;
        int ans = nums.length;
        while (i <= j) {
            int mid = i+(j-1)/2;
            if (nums[mid] >= x) {
                ans = mid;
                j = mid -1;
            }
            else{
                i = mid +1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
        int x = 3;

        // Create an instance of the Solution class
        LowerBound sol = new LowerBound();

        // Function call to find the lower bound
        int ind = sol.lowerBound(nums, x);

        System.out.println("The lower bound is the index: " + ind);
    }
    
}
