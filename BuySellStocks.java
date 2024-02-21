class buySellStocks{
    public int maxProfit(int[] prices) {
       int minPrice = Integer.MAX_VALUE;
       int maxProfit = 0;
       int todayProfit =0;
       for(int i=0; i< prices.length; i++){
           if(prices[i]<minPrice){
               minPrice = prices[i];
           }
           todayProfit = prices[i]- minPrice;
           if(maxProfit < todayProfit){
               maxProfit = todayProfit;
           }
       }
       return maxProfit;
    }
}