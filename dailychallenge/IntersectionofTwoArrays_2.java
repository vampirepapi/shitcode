package dailychallenge;
import java.util.Arrays;

public class IntersectionofTwoArrays_2 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        // Sort both arrays to apply the two-pointer approach
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        // Initialize pointers for both arrays
        int i=0, j=0, k=0;

        // Loop through both arrays to find common elements
        while (i<nums1.length && j<nums2.length) {
            if (nums1[i]<nums2[j]) { // If element in nums1 is smaller, move its pointer
                i++;
            }
            else if (nums1[i]>nums2[j]) { // If element in nums2 is smaller, move its pointer
                j++;
            }
            else{ // If elements are equal, add to result and move both pointers
                nums1[k++] = nums1[i++]; // Store the intersection in nums1 and increment pointers
                j++;
            }
        }
        // Return only the part of nums1 that contains the intersections
        return Arrays.copyOfRange(nums1,0,k);
    }
    public static void main(String[] args) {
       int[] nums1 = {4,9,5}; 
       int[] nums2 = {9,4,9,8,4};
       // Find and print the intersection of two arrays
       int[] intersect = intersect(nums1,nums2);
       for (int i : intersect) {
        System.out.println(i);
       }
    }
}


//TC= O(n log n+m log m)
//SC= O(1)