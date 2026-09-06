class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int left =0;
        int right = left+1;
        int n = prices.length;
        while(left<right && right < n){
            if(prices[left]<prices[right]){
                max += prices[right]-prices[left];
                left = right;
            }
            else{
                left++;
            }
            right++;
        }
        return max;
    }
}