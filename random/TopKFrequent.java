import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * TopKFrequent
 */
public class TopKFrequent {

    public static int[] topKFrequent(int[] nums, int k) {
        //init a hashmap to store key:freq pair
        HashMap<Integer,Integer> map = new HashMap<>();
        //start iterating eas element from nums arr and store in hashmap wt it frequency
        for(int i: nums){
            map.put(i, 1+map.getOrDefault(i, 0));
        }
        //init a max heap priority queue with custom comparator
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> map.get(b) - map.get(a)
        );
        //add all the keys of hashmap to priority queue
        pq.addAll(map.keySet());
        //init ans of length k
        int[] ans = new int[k];
        for (int index = 0; index < ans.length; index++) {
            ans[index] = pq.poll();
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {1,1,1,2,2,3,3,3,3,3}; 
        int k = 2;
        int[] res = (topKFrequent(nums,k));
        for (int i : res) {
            System.out.println(i);
        }
    }
}