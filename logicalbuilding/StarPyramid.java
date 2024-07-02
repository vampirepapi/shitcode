package logicalbuilding;

public class StarPyramid {
    public static void pattern(int n) {
        for(int i=0; i<n; i++){ //for rows
            for(int j=0;j<n-i-1;j++){ //for printing spaces
                System.out.print(" ");
            }
            //for printing stars
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            //for printing spaces
            for(int l=0;l<n-i-1;l++){ //for printing spaces
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        pattern(5);
    }
    
}
