class Solution {
    public int maxProfit(int[] prices) {
       int curprofit=0;
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            curprofit=Math.max(0,curprofit+=prices[i]-prices[i-1]);
                maxprofit=Math.max(curprofit,maxprofit);
            
        }
        return maxprofit;
    }
}