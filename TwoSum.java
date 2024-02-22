public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i]+numbers[j] == target) {
                    ans[0] = i+1;
                    ans[1] = j+1;
                    break;
                }   
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] numbers = {-1,0};
        int target = -1;
        int[] ans = twoSum(numbers,target);
        for (int i : ans) {
            System.out.println(i);
            
        }
    }
}