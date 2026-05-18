class Solution {
    public int leastInterval(char[] tasks, int n) {
      int [] heap=new int[26];
      int time=0;
      List<Integer> temp = new ArrayList<>();
      PriorityQueue<Integer> res= new PriorityQueue<>((a,b)->(b-a));
       for(int i=0;i<tasks.length;i++) {
        heap[tasks[i]-'A']++;
       }
       for(int i=0;i<26;i++){
        if(heap[i]>0)
         res.add(heap[i]);
       }
       while(!res.isEmpty()){
       for(int i = 0; i <= n && !res.isEmpty(); i++) {
            temp.add(res.poll() - 1);
            time++;
        }
         for(int count : temp) {
             if(count > 0) res.offer(count);
         }
         if(!res.isEmpty())
          time+=n+1-temp.size();
        temp.clear();
       }
        return time;
    }
}
