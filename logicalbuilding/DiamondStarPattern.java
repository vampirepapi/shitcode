package logicalbuilding;

public class DiamondStarPattern {
    public static void pattern(int n){
        //star pyramid
        for(int i=0; i<n; i++){
            //for printing spaces
            for(int x=0; x<n-i-1; x++){
                System.out.print(" ");
            }
            //for printing stars
            for(int y=0; y<2*i+1; y++){
                System.out.print("*");
            }
            //for printing spaces
            for(int z=0; z<n-i-1; z++){
                System.out.print(" ");
            }
            System.out.println();
        }
        //inverted star pyramid
        for(int i=0; i<n; i++){
            //for printing spaces
            for(int x=0; x<i; x++){
                System.out.print(" ");
            }
            //for printing stars
            for(int y=0; y<((2*n)-(2*i+1)); y++){
                System.out.print("*");
            }
            //for printing spaces
            for(int z=0; z<i; z++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern(5);
        
    }
}
