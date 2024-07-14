package recursion;

public class ReverseArray {
    public static void revArr(int[] arr, int i, int j) {
        if (i >= j)
            return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        revArr(arr, i + 1, j - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        revArr(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");

        }
    }
}