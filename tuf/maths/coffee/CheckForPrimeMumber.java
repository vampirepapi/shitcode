package coffee;

public class CheckForPrimeMumber {
    public boolean isPrime(int n) {
        if (n<2) return false;
        for (int i=2; i<=n/2; i++){
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        CheckForPrimeMumber obj = new CheckForPrimeMumber();
        System.out.println(obj.isPrime(4));
    }
}
