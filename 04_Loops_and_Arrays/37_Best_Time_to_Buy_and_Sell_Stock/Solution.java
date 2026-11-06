class Solution {
    public int maxProfit(int[] prices) {
        int low=prices[0],best=0;
        for(int i=1; i<prices.length; i++){
            int profit=prices[i]-low;
            if(profit>best)best=profit;
            if(prices[i]<low)low=prices[i];
        }
        return best;
    }
}
