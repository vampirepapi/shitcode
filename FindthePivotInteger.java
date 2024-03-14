public class FindthePivotInteger {
    public int pivotInteger(int n) {
        //calculating median
        int median = (int) Math.ceil(n/2);
        //sum till median
        int sumOfMedian = 0;
        for (int i = 1; i <= median; i++) {
            sumOfMedian+=i;
        }
        //sum after median inc median
        int sumAfterMedian = 0;
        for (int i = median; i <= n; i++) {
            sumAfterMedian+=i;
        }
        for (int i = median; i <= n; i++) {
            if (sumOfMedian == sumAfterMedian) {
                return i;
            }
            sumOfMedian+=(i+1);
            sumAfterMedian-=i;
        }
        return -1;
        
    }
    public static void main(String[] args) {
        FindthePivotInteger s = new FindthePivotInteger();
        System.out.println(s.pivotInteger(49));
    }
}