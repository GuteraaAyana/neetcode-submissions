class Solution {
    public int maxProfit(int[] prices) {
        int min_price = prices[0];
        int max_profit = 0;

        for(int i = 1; i < prices.length; i++){
            int diff = prices[i] - min_price;
            if(diff > max_profit) max_profit = diff;
            if(prices[i] < min_price) min_price = prices[i];
        }

        return max_profit;
    }
}
