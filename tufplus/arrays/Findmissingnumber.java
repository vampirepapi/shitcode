package tufplus.arrays;


public class Findmissingnumber {
    public int missingNumber(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for(int nos : nums){
            sum1+=nos;
        }
        for (int i = 0; i <= nums.length; i++) {
            sum2+=i;
        }
        return sum2-sum1;

        
    }
    public static void main(String[] args) {
        int[] nums = {0,1, 2, 4};
        
        // Create an instance of the Solution class
        Findmissingnumber solution = new Findmissingnumber();
        
        /* Call the missingNumber method 
        to find the missing number */
        int ans = solution.missingNumber(nums);
        
        System.out.println("The missing number is: " + ans);
    }
}
