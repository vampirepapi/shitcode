package tufplus.arrays;

import java.util.ArrayList;
import java.util.List;

public class Intersectionoftwosortedarrays_TwoPointer {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        // ans list
        List<Integer> ans =  new ArrayList<>();
        // two pinters
        int i=0;
        int j=0;

        //iterate till one of the go out of bounds
        while(i < nums1.length && j < nums2.length){
            if (nums1[i] < nums2[j]) i++;
            else if (nums1[i] > nums2[j]) j++;
            else{
                ans.add(nums1[i++]);
                j++;
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
