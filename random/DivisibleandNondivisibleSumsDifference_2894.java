package random;

public class DivisibleandNondivisibleSumsDifference_2894 {
    public static int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;
        for (int i = 1; i < n + 1; i++) {
            if (i % m == 0) {
                num2 += i;
            } else {
                num1 += i;
            }
        }
        return num1 - num2;
    }

    public static void main(String[] args) {
        int n = 5, m = 6;
        System.out.println(differenceOfSums(n, m));
    }
}
