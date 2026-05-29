
// 3300. Minimum Number After Replacement With Digit Sum
// time complexity: O(n*m), where n is the length of the input array and m is the number of digits in the largest number
// space complexity: O(1)

class MinNumberAfterRepl{
    public int minElement(int[] nums) {
        int minVal=Integer.MAX_VALUE;

        for(int num:nums){
            int sum=0;
            while(num>0){
               int digit=num%10;
                sum+=digit;
                num/=10;
            }
            minVal=Math.min(minVal,sum);
        }
        return minVal;
    }
}