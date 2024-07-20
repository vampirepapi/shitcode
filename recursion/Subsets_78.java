package recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets_78 {
    public static List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        helper(0, nums, new ArrayList<>(), result);
        return result;

    }

    public static void helper(int idx, int[] nums, ArrayList<Integer> list, ArrayList<List<Integer>> result) {
        if (idx == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[idx]);
        helper(idx + 1, nums, list, result);

        list.remove(list.size() - 1);
        helper(idx + 1, nums, list, result);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> subsets = subsets(nums);
        System.out.println(subsets);
    }
}
