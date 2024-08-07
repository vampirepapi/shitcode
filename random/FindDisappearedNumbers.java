import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class FindDisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        //using hashset to store the element, as searching takes constant time in hashset, while in arraylist it takes linear time
        Set<Integer> numSet = new HashSet<>();

        // Copy all elements to the set
        for (int num : nums) {
            numSet.add(num);
        }

        // Calculate the nums length
        int n = nums.length;

        // Iterate through nums length and check
        for (int i = 1; i <= n; i++) {
            if (!numSet.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
