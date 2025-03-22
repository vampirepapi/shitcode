package tuf.binarysearch;

public class Solution {

    public long floorSqrt(long n) {
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (i*i <= n) {
                ans = i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        long n = 28;
        System.out.println(sol.floorSqrt(n));
    }
}