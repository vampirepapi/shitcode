package logicalbuilding;

public class HalfDiamondStarPattern {
    public static void pattern(int n) {
        // upper half
        for(int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // lower half
        for(int i = n-1; i > 0; i--){
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        pattern(5);
    }
}
