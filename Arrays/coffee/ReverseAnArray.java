package Arrays.coffee;

public class ReverseAnArray {
    public void reverse(int[] arr, int n) {
        int start = 0;
        int end  = n-1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        ReverseAnArray obj = new ReverseAnArray();
        int[] arr = {1,2,3,4,5};
        obj.reverse(arr, arr.length);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
