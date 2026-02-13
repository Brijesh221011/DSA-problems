// 441. Arranging Coins
//time complexity: O(sqrt(n))
//space complexity: O(1)

class Solution {

     public int arrangeCoins(int n) {
        int i=1;
        while(n>0){
            i++;
            n=n-i;
        }
        return i-1;
    }
}