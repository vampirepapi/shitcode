import java.util.HashSet;
import java.util.Set;

class LongestConsecutive {
    public static int longestConsecutive(int[] nums) {
        //null check
        if (null==nums || nums.length==0) {
            return 0;
        }
        //define a hashset and move all nums element to the hashmap
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        //init a var longest streak
        int longestStreak = 1;
        //itr hashmap elements to check for start of the sequence
        for (int i : set) {
            if (!set.contains(i-1)) { //checking start of the sequence
                int length=1;
                while (set.contains(i+length)) {
                    length++;
                }
                longestStreak = Math.max(longestStreak, length);
            }            
        }
        return longestStreak;
    }
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
}