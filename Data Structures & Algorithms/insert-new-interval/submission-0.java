class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int i=0;
        for( i=0;i<intervals.length;i++){
            if(intervals[i][1]<newInterval[0]){
                res.add(intervals[i]);
                continue;
            }
            if(intervals[i][0] > newInterval[1]) {
                res.add(newInterval);
                while(i < intervals.length)
                    res.add(intervals[i++]);
                return res.toArray(new int[res.size()][]);
            }
            else{
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
        }
        res.add(newInterval); 
       
        return res.toArray(new int[res.size()][2]);
    }
}
