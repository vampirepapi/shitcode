package tuf.binarysearch;

public class FindSquareRootOfANumber {
    public long floorSqrt(long n) {
        long ans = 0;
        long i = 1, j = n;
        while (i <= j) {
            long mid = (i+j)/2;
            long val = mid*mid;
            //if mid*mid is less than or equal to n, we update the answer to mid and search in the right half of the search space.
            if (val <= n) {
                ans = mid;
            //if mid*mid is greater than n, we search in the left half of the search space.
                i = mid +1;
            }
            else{
                j = mid -1;
            }
        }
        return ans;
    }
}
