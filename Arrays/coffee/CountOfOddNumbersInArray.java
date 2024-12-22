package Arrays.coffee;

public class CountOfOddNumbersInArray {
    public int countOdd(int[] arr, int n) {
        int cnt = 0;
        for(int i=0; i<arr.length-1; i++){
            if (arr[i]%2 == 1) {
                cnt++;
            }
        }
        return cnt;
    }
}
