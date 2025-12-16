import java.util.Arrays;
public class Solution{
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
       
        int[] nums = {2,1,2};
        int result = largestPerimeter(nums);
        System.out.println("Largest Perimeter: " + result);
    }
}