class Solution {
public int maxProfit(int[] prices) {
       int buyPointer = 0;
       int maxProfit =0;
       for (int sellPointer = 1; sellPointer < prices.length; sellPointer ++ ){ 
           if (prices[sellPointer] - prices[buyPointer] < 0){ //no profit possible 
               buyPointer = sellPointer;
           }
           else {
               int currentProfit = prices[sellPointer] - prices[buyPointer];
               maxProfit = Math.max(currentProfit, maxProfit);
           }
       }
       return maxProfit;
    }
}
