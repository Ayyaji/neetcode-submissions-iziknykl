class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        int[][] q=new int[queries.length][2];
        for(int i=0;i<q.length;i++){
            q[i]=new int[]{i,queries[i]};
        }
        Arrays.sort(q,(a,b)->a[1]-b[1]);
        int j=0;
        int[] res=new int[queries.length];

        for(int i = 0; i < q.length; i++) {
           while(j < intervals.length && intervals[j][0] <= q[i][1]) {
                int size = intervals[j][1] - intervals[j][0] + 1;
                pq.offer(new int[]{size, intervals[j][1]});
                j++;
            }
            while(!pq.isEmpty() && pq.peek()[1] < q[i][1])
                pq.poll();
            res[q[i][0]] = pq.isEmpty() ? -1 : pq.peek()[0];
        }
        return res;
    }
}
