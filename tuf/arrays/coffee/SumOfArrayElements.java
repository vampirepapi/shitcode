package Arrays.coffee;

public class SumOfArrayElements {
    public  int sum(int arr[], int n) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
      
    }
    public static void main(String[] args) {
        SumOfArrayElements obj = new SumOfArrayElements();
        int[] arr = {1,2,3,4,5};
        int sumOfAllEle = obj.sum(arr, arr.length-1);
        System.out.println(sumOfAllEle);
    }
}