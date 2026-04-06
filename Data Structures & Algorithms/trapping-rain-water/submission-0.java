class Solution {
    public int trap(int[] height) {
      int l=0,r=height.length-1,w=0,ml=0,mr=0;
      while(l<=r)
      {
        ml=Math.max(ml,height[l]);
        mr=Math.max(mr,height[r]);
        if(ml<mr)
       {
        w+=ml-height[l];
         l++;
      }
        else
        {
       w+=mr-height[r];
        r--;
      }
      }
      return w;
    }
}
