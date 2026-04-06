class Solution {
    public int maxProfit(int[] prices) {
        int mp;
        mp=Integer.MAX_VALUE;
        int mx;
        mx=0;
        for (int pr:prices)
        {
            if(pr<mp)
            {
                mp=pr;
                continue;
            }
           
            mx=Math.max(mx,pr-mp);
        }
        return mx;
    }
}
