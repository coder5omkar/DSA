class Solution {
    public int maxProfit(int[] prices) {

        if(prices == null || prices.length == 1) return 0;

        int profit = 0;
        int small = Integer.MAX_VALUE;

        for(int price : prices){
            if(price < small){
                small = price;
            }else if(price - small > profit){
                profit = price - small;
            }
        } 
        return profit;
    }

}