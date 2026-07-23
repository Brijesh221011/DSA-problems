
//3513. No Of Unique XOR Triplet - I
//time complexity: O(log n), since we are using bitwise left shift operation to find the next power of 2 greater than n.
//space complexity: O(1), since we use a constant amount of space.

class UniqueXORTriplet {

    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;

        if (n == 1){
           return 1;
        } 
        if (n == 2){
           return 2;
        } 

        int result = 1;
        while (result <= n) {
            result <<= 1;
        }

        return result;
    }
}