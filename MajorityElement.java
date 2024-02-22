import java.util.HashMap;

class MajorityElement {
    public static int majorityElement(int[] nums) {
        //we will need a hashmap to store count of every values
        HashMap<Integer,Integer>k = new HashMap<>();
        //iterate through the nums arr and store the key with its count
        for (int i : nums) {
            //storing count for the encountered key,default is 0 if not found
            //or increment the counter by +1 if found
            k.put(i, k.getOrDefault(i, 0)+1);
        }
        //find the element with maximum count
        int majorityElement = 0, maxCount = 0;
        //iterate through the hashmap to find the element with max count
        for(HashMap.Entry<Integer,Integer> entry : k.entrySet()){
            if (entry.getValue()>maxCount) {
                maxCount = entry.getValue();
                majorityElement = entry.getKey();
            }
        }
        return majorityElement;        
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,3,3,3};
        System.out.println(majorityElement(nums));

    }
}
