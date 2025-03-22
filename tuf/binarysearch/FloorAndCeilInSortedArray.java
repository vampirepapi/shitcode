package tuf.binarysearch;

public class FloorAndCeilInSortedArray {
    public int getFloor(int[] nums, int x) {
        int ans = -1;
        int i = 0, j = nums.length -1;
        while (i <= j) {
            int mid = i+(j-i)/2;
            if (nums[mid] <= x) {
                ans = nums[mid];
                i = mid +1;
            }
            else{
                j = mid -1;
            }            
        }
        return ans;
    }

    public int getCeil(int[] nums, int x) {
        int ans = -1;
        int i = 0, j = nums.length -1;
        while (i <= j) {
            int mid = i+(j-i)/2;
            if (nums[mid] >= x) {
                ans = nums[mid];
                j = mid -1;
            }
            else{
                i = mid +1;
            }            
        }
        return ans;        
    }


    public int[] getFloorAndCeil(int[] nums, int x) {
       int floor = getFloor(nums, x);
       int ceil = getCeil(nums, x);
       return new int[]{floor, ceil};
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 4, 7, 8, 10};
        int target = 5;
        FloorAndCeilInSortedArray sol = new FloorAndCeilInSortedArray();
        int[] floorAndCeil = sol.getFloorAndCeil(nums, target);
        System.out.println(floorAndCeil[0] +" "+ floorAndCeil[1]);
    }
}
