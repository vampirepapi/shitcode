package coffee;

public class CountAllDigitsOfANumber {
    public int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            System.out.println(n);
            count++;
        }
        return count;

    }
    public static void main(String[] args) {
        CountAllDigitsOfANumber obj = new CountAllDigitsOfANumber();
        int res = obj.countDigit(12345);
        System.out.println(res);
    }
    
}
