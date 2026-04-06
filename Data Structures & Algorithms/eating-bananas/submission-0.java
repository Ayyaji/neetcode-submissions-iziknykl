class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int l=1,r=0,mk=Integer.MAX_VALUE,k=0,m=0; 
      for(int i:piles)
       {
        r=Math.max(r,i);
       }
       while(l<=r)
       {
        k=0;
        m=(l+r)/2;
        for(int i=0;i<piles.length;i++)
        {
            
            k+=Math.ceil((double)piles[i]/m);
        }
        if(k<=h)
        {
            mk=m;
            r=m-1;
        }
        else
        l=m+1;

       }
        return mk;
    }
}
