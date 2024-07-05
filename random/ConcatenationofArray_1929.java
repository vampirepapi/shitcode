package random;

public class ConcatenationofArray_1929 {
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        int i = 0;
        for (int x : nums) {
            ans[i] = x;
            ans[nums.length + i] = x;
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] concatenation = getConcatenation(nums);
        for (int i : concatenation) {
            System.out.print(i + " ");
        }
    }
}