class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int j=1;
        int maximum=0;
        while(j<prices.length){
            if(prices[j]>prices[i]){
                maximum=Math.max(maximum,prices[j]-prices[i]);
                
            }
            else{
                i=j;
            }

            j++;
        }
        return maximum;
    }
}