import java.util.*;
class Solution {
    
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }
            if(prices[i] - buy > profit){
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}