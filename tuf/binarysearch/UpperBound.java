package tuf.binarysearch;

public class UpperBound {
    public int upperBound(int[] nums, int x) {
        int i = 0, j = nums.length -1;
        int ans = nums.length;
        while(i <= j){
            int mid = i+(j-i)/2;
            if (nums[mid] > x){
                ans = mid;
                j = mid -1;
            }
            else{
                i = mid+1;
            }
        }
        return ans;
    }
    
}
