class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> d=new Stack<>();
        int idx=0,i;
        //int []res=new int[temperatures.length];
        for(i=0;i<temperatures.length;i++){
            while(!d.isEmpty() && temperatures[i]>temperatures[d.peek()])
            {
                idx=d.pop();
                temperatures[idx]=i-idx;
            }
            d.push(i);
         
            
        
        }
        while(!d.isEmpty())
         {
            i=d.pop();
            temperatures[i]=0;
         }
        return temperatures;
    }

}
