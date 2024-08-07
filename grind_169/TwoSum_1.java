package grind_169;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    //approach_1: if arr is sorted then we can use two pointer approach to solve this problem
    public int[] twoSum(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;

        while (left < right) {
            if (nums[left]+nums[right] == target) {
                return new int[]{left, right};
            }
            else if (nums[left]+nums[right] > target) {
                right--;
            }
            else{
                left++;
            }
        }
        return new int[]{0,0};
    }

    //approach_2: bruteforce approach - O(n^2)
    public int[] twoSum_2(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if (nums[i]+nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }

    //approach_3: optimised approach using hashmap - O(n)
    public int[] twoSum_3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            int diff = target - num;
            if(map.containsKey(diff)){
                return new int[]{i,map.get(diff)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
    public static void main(String[] args) {
        TwoSum_1 obj = new TwoSum_1();
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = obj.twoSum_3(nums, target);
        System.out.println(Arrays.toString(result));
    }
    
}
