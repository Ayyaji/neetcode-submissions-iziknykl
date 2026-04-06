class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
      int [][] car=new int[position.length][2];
     
      Stack<Integer> s=new Stack<>();
      double []t= new double[position.length];
      for(int i=0;i<position.length;i++)
      {
            car[i][0]=position[i];
            car[i][1]=speed[i];
      }
      Arrays.sort(car,(a,b)->b[0]-a[0]);
    
     for(int i=0;i<position.length;i++)
      {
         t[i]=(double)(target-car[i][0])/car[i][1];
      }
        for(int i=0;i<position.length;i++)
        {
            if(s.isEmpty())
            {
                s.push(i);
                continue;
            }
            if(t[i]>t[s.peek()])
            {
                s.push(i);
            }

        }
      return s.size();
    }
}
