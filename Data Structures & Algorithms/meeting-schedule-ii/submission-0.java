/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if(intervals == null || intervals.size() == 0) return 0;
        int count=0,s=0,e=0;
        List<Integer>start=new ArrayList<>();
        List<Integer>end=new ArrayList<>();
        for(int i=0;i<intervals.size();i++){
            start.add(intervals.get(i).start);
            end.add(intervals.get(i).end);
        }
        Collections.sort(start);
        Collections.sort(end);
        while(e<end.size() && s<start.size()){
            if(end.get(e)>start.get(s)){
                count++;
                s++;
            }
            else{
                s++;e++;
            }
            }
            return count;
        }
        
        
    }

