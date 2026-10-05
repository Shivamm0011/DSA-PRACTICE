class Solution {
    public int maxProfit(int[] prices) {
     int i=0;
     int mprofit = 0;
     int j=1;
     while(j< prices.length){
        if(prices[j]>prices[i]){
            int profit = prices[j]-prices[i];      
        if(profit>mprofit){
            mprofit = profit;
        }}
        else{
            i=j;
        }
     j++;
     }
    return mprofit;

    }
}