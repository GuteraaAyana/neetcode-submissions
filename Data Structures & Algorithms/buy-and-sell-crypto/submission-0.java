class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int start = 0;
        int end = prices.length - 1;

        for(int i = 0; i < prices.length; i++){
            for(int j = i; j < prices.length; j++){
                if(prices[i] > prices[j]) continue;
                int diff = prices[j] - prices[i];
                if(profit < diff) profit = diff;
            }
        }

        return profit;
    }
}
