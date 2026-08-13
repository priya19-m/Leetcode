class Solution {
    public int maxProfit(int[] prices) {
        int minPrices = prices[0];
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
            minPrices = Math.min(minPrices, prices[i]);
            int profit = prices[i] - minPrices;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}