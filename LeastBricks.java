import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class LeastBricks {
    public int leastBricks(List<List<Integer>> wall) {
        //hashmap to store key:gap pair
        HashMap<Integer,Integer> gapsMap = new HashMap<>();
        //init max gap variable
        int maxGap = 0;
        // start iterating each list of integers from the input
        for (List<Integer> row : wall) {
            //now iterate through each of the element and calculate gap
            //init a total counter ie to know where gaps is found
            int total =0;
            for (int i = 0; i < row.size()-1; i++) {
                total+=row.get(i);
                gapsMap.put(total, gapsMap.getOrDefault(total, 0)+1);
                maxGap = Math.max(maxGap, gapsMap.get(total));
            }
        }
        return wall.size()-maxGap; 
    }
    public static void main(String[] args) {
        // Test input
        List<List<Integer>> wall = new ArrayList<>();
        wall.add(Arrays.asList(1, 2, 2, 1));
        wall.add(Arrays.asList(3, 1, 2));
        wall.add(Arrays.asList(1, 3, 2));
        wall.add(Arrays.asList(2, 4));
        wall.add(Arrays.asList(3, 1, 2));
        wall.add(Arrays.asList(1, 3, 1, 1));

        // Create an instance of the Solution class
        LeastBricks solution = new LeastBricks();

        // Test the leastBricks function
        int result = solution.leastBricks(wall);

        // Print the result
        System.out.println("Minimum bricks to cut: " + result);
    }
}