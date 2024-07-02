package logicalbuilding;

public class InvertedStarPyramid {
    public void pattern(int n) {
        for (int i = 0; i < n; i++) {
            //for spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //for stars
            for (int k = 0; k < ((2*n)-(2*i)-1); k++) {
                System.out.print("*");
            }
            //for spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();            
        }   
    }
    public static void main(String[] args) {
        InvertedStarPyramid is = new InvertedStarPyramid();
        is.pattern(5);
    }
}
