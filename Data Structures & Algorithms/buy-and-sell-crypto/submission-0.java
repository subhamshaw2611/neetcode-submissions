class Solution {
    public int maxProfit(int[] prices) {
        int mainProfit = 0;
        int buy = 0;
        for (int sell=1;sell < prices.length ; sell++) {
            if (prices[buy] >= prices[sell]) {
                buy = sell;
            }else{
                int profit=prices[sell]-prices[buy];
                mainProfit=(profit>mainProfit? profit:mainProfit);
            }
        }
        return mainProfit;
    }
}
