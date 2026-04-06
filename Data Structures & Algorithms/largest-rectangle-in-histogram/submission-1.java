class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> s=new Stack<>();
        int a=0,i=0;
        for(i=0;i<heights.length;i++)
        { 
            int st=i;
           
             while(!s.isEmpty() &&s.peek()[1]>heights[i])
            {
                st=s.peek()[0];
                a=Math.max(a,((i-s.peek()[0])*s.peek()[1]));
                s.pop();
            }
             s.push(new int[]{st, heights[i]});
          
        }
         while(!s.isEmpty())
            {
                a=Math.max(a,((heights.length-s.peek()[0])*s.peek()[1]));
                s.pop();
            }
              

        return a;

    }
}
