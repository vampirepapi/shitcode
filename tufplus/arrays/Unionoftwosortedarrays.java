package tufplus.arrays;

import java.util.ArrayList;
import java.util.List;

public class Unionoftwosortedarrays {
    public int[] unionArray(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();

        int m = nums1.length;
        int n = nums2.length;

        //init two ptrs, one for nums1 and another one for nums2
        int i = 0;
        int j = 0;

        while (i < m && j < n ) {
            if (nums1[i] < nums2[j]) {
                if (ans.isEmpty() || ans.get(ans.size()-1) != nums1[i]) {
                    ans.add(nums1[i]);
                }
                i++;
            }
            else {
                if (ans.isEmpty() || ans.get(ans.size()-1) != nums2[j]) {
                    ans.add(nums2[j]);
                }
                j++;
            }
        }
        //rest elements present in nums1
        while (i < m) {
            if (ans.isEmpty() || ans.get(ans.size()-1) != nums1[i]) {
                ans.add(nums1[i]);
            }
            i++;
        }

        //rest elements present in nums2
        while (j < n) {
            if (ans.isEmpty() || ans.get(ans.size()-1) != nums2[j]) {
                ans.add(nums2[j]);
            }
            j++;
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

}
