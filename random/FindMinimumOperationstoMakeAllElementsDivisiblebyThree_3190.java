package random;

public class FindMinimumOperationstoMakeAllElementsDivisiblebyThree_3190 {

    public static int minimumOperations(int[] nums) {
        int opers = 0;
        for (int i : nums) {
            int remainder = i % 3;
            if (remainder == 1 || remainder == 2) {
                opers++;
            }
        }
        return opers;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 6, 9 };
        System.out.println(minimumOperations(nums));
    }
}
