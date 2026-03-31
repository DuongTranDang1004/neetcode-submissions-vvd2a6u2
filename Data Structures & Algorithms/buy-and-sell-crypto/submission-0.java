class Solution {
   public int maxProfit(int[] prices) {
        int maxProfit = 0;

        int minBuyPriceUntilCurrentDay = prices[0];

        for (int i =  1; i < prices.length; i ++){
minBuyPriceUntilCurrentDay = Math.min(minBuyPriceUntilCurrentDay, prices[i]);            int currentProfit = prices[i] - minBuyPriceUntilCurrentDay;
            maxProfit = Math.max(currentProfit,maxProfit);

        }
return maxProfit;
    }
}
