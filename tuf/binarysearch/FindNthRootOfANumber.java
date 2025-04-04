package tuf.binarysearch;

public class FindNthRootOfANumber {
    public static int NthRoot(int N, int M) {
        for (int i = 1; i <= N; i++) {
            int nThRoot = 1;
            for (int j = 0; j < N; j++) {
                nThRoot *= i;
            }
            if (nThRoot == M) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int N = 4, M = 81;
        System.out.println(NthRoot(N,M));
    }
}
