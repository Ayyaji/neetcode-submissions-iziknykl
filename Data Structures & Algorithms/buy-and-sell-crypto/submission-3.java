class Solution {
    public int maxProfit(int[] prices) {
    int mp=Integer.MAX_VALUE;
    int max=0;
    for(int i:prices)
    {
      
       if(mp>i)
       {
        mp=i;
        continue;
       }
       max=Math.max(max,i-mp);
    }

        return max;
    }
    
}
