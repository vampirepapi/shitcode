package logicalbuilding;

public class Demo {
    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i+1);
            }
            System.out.println();            
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
