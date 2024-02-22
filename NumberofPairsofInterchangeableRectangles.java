import java.util.HashMap;
import java.util.Map;

public class NumberofPairsofInterchangeableRectangles {
    // Function to count interchangeable rectangles
    public static long interchangeableRectangles(int[][] rectangles) {
        // Step 1: Initialize a map to store counts of ratios
        Map<Double, Long> map = new HashMap<>();
        
        // Step 2: Iterate through each rectangle in the array
        for (int[] rec : rectangles) {
            // Step 3: Calculate the ratio of width to height for the current rectangle
            double key = (double) rec[0] / rec[1];
            
            // Step 4: Update the map with the count of rectangles having the same ratio
            map.put(key, map.getOrDefault(key, (long) 0) + 1);
        }
        
        // Step 5: Initialize a variable to accumulate the result
        long res = 0;
        
        // Step 6: Iterate through counts in the map and calculate pairs for each ratio
        for (long val : map.values()) {
            res += val * (val - 1) / 2;
        }
        
        // Step 7: Return the final result
        return res;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Example input array of rectangles
        int[][] rectangles = {{4, 8}, {3, 6}, {10, 20}, {15, 30}};
        
        // Step 8: Call the interchangeableRectangles function and print the result
        System.out.println(interchangeableRectangles(rectangles));
    }
}
