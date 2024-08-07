import java.util.ArrayList;
import java.util.List;

class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // Create an ArrayList to represent the flowerbed with extra 0s at the beginning and end
        List<Integer> f = new ArrayList<>();
        f.add(0);  // Add a 0 at the beginning

        // Copy elements from the input flowerbed array to the ArrayList
        for (Integer intVal : flowerbed) {
            f.add(intVal);
        }

        f.add(0);  // Add a 0 at the end

        // Iterate through the extended flowerbed to check and update flower planting
        for (int i = 1; i < f.size() - 1; i++) {
            // Check if the previous, current, and next positions are all 0
            if (f.get(i - 1) == 0 && f.get(i) == 0 && f.get(i + 1) == 0) {
                // If conditions are met, set the current position to 1 (plant a flower)
                f.set(i, 1);
                // Decrease the count of remaining flowers to plant
                n--;
            }
        }

        // Check if all flowers have been planted (n is less than or equal to 0)
        return n <= 0;
    }
}
