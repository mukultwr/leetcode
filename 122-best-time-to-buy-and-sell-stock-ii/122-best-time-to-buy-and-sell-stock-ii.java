class Solution {
    public int maxProfit(int[] prices) {
        int curProfit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                curProfit+=prices[i]-prices[i-1];
            }
            
            
            
        }
        
        return curProfit;
        
        
    }
}