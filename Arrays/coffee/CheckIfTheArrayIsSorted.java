package Arrays.coffee;

public class CheckIfTheArrayIsSorted {
    boolean arraySortedOrNot(int[] arr, int n) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i+1]) {
                return false;
            }
        }
       return true;
    }
    
}
