/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */

class Solution {
    /**
     * Insert newInterval into intervals.
     * @param intervals: Sorted interval list.
     * @param newInterval: A new interval.
     * @return: A new sorted interval list.
     */
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<Interval>();
        // write your code here
        
        if (newInterval == null) {
            return intervals;
        }
        if(intervals == null || intervals.size() ==0) {
            result.add(newInterval);
            return result;
            
        }
        int size = intervals.size();
        int i = 0;
        for(Interval temp:intervals) {
            if(temp.end < newInterval.start) {
                result.add(temp);
                i++;
            } else if(temp.start > newInterval.end) {
                result.add(temp);
                
            } else {
                newInterval.start = Math.min(temp.start, newInterval.start);
                newInterval.end = Math.max(temp.end, newInterval.end);
            }
        }
        result.add(i,newInterval);
        return result;
    }
}
