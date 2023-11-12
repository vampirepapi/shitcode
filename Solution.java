import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        //new arraylist to represent flowebwd with extras 0's at the beginning and end
        List<Integer> f = new ArrayList<>();
        //add 0 at the begnining
        f.add(0);
        //copy all the elements of flowerbed to f
        for (int integer : flowerbed) {
            f.add(integer);
        }
        //add 0 at the end
        f.add(0);

        //iterate through extended f to check and update flower planting
        for (int i = 1; i < f.size()-1; i++) {
            //check if the previous, current and next positions are all 0
            if(f.get(i-1)==0 && f.get(i)==0 && f.get(i+1)==0){
                //if the condition is met, set the current position to 1 (plant a flower)
                f.set(i, 1);
                //decrease the count of remaining flowers to plant
                n--;
            }    
        }
        return n<=0;
    }
}