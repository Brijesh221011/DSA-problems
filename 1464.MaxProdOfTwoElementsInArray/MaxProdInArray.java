
//1464. Maximum Product of Two Elements in an Array
//time complexity: O(nlogn), since we are sorting the array.
//space complexity: O(1), since we use a constant amount of space.

class MaxProdInArray{
    public int maxProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int num1=(nums[n-1]-1);
        int num2=(nums[n-2]-1);

        return  num1*num2;
    }
}