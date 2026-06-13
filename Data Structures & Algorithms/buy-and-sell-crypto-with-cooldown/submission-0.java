class Solution {
    public int maxProfit(int[] prices) {
        int[] hold=new int[prices.length];
        int[] sold=new int[prices.length];
        int[] cool=new int[prices.length];
        hold[0]=-prices[0];
        sold[0]=0;
        cool[0]=0;
        int max=0;
        for(int i=1;i<prices.length;i++){
            hold[i]=Math.max(hold[i-1], cool[i-1] - prices[i]);
            sold[i]=hold[i-1] + prices[i];
            cool[i]=Math.max(sold[i-1], cool[i-1]);
            max=Math.max(sold[i],max);
        }

        return max;
    }
}
