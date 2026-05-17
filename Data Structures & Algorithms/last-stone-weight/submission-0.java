class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> st=new PriorityQueue<>(stones.length, (a, b) -> b - a);
        for(int i=0;i<stones.length;i++){
            st.add(stones[i]);
        }
        int x=0;
        while(!st.isEmpty() ){
            x=st.poll();
            if(st.isEmpty())
                break;
            if(x==st.peek()){  
            st.poll();
            x=0;
            continue;
            } 
            x=x-st.poll();
            st.add(x);     
           
        }
        return x;
    }
}
