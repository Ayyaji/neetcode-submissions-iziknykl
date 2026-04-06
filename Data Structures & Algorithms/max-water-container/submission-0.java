class Solution {
    public int maxArea(int[] heights) {
        int l=0,h=heights.length-1;
        int max=0;
        while(l<heights.length || h<0)
        {
            if(heights[l]<=heights[h])
              {  max=Math.max(max,heights[l]*(h-l));
                l++;
              }
            else
               { max=Math.max(max,heights[h]*(h-l));
                h--;
        }}
        

        return max;
    }
}
