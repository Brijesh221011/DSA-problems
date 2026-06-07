
//121. Best Time to Buy and Sell Stock
//time complexity: O(n), where n is the length of the input array
//space complexity: O(1) 

class BuyAndSellStock{
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int buyPrice=prices[0];

        for(int i=1;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
}