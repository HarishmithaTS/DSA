class Solution {
    public int maxProfit(int[] prices) {
     int Profit=0;
     int buying_price = prices[0];
     for(int i=0; i<prices.length;i++){
         if(buying_price>prices[i]){
            buying_price=prices[i];
            continue;
         }
          Profit =Math.max(Profit,prices[i]-buying_price );
     }
      return Profit;
     
    }
    
}