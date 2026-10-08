class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int n = prices.length;
        int least = prices[0];
        for(int i=1;i<n;i++){
            if(prices[i]>least){
                max = Math.max(prices[i]-least,max);
            }
            if(prices[i]<least){
                least = prices[i];
            }
        }
        return max;
    }
}
