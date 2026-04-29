
//136. Single Number
//time complexity: O(n), where n is the length of the input array, since we are iterating through the array once to compute the XOR of all elements.
//space complexity: O(1), since we are using only a constant amount of extra space to store the XOR result.

class SingleNumber{
     public int singleNumber(int[] nums) {
        int xor=0;

        for(int num:nums){
            xor^=num;
        }
        return xor;
    }
}