class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int totalProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            } 
        
            else {
                totalProfit += prices[i] - buyPrice;
                buyPrice = prices[i]; 
            }
        }
        return totalProfit;
    }
}
