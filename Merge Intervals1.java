// 2220ms
/**
 * Definition of Interval:
 * public class Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */
import java.util.*; 
class Solution {

    /**
     * @param intervals: Sorted interval list.
     * @return: A new sorted interval list.
     */
    public List<Interval> merge(List<Interval> intervals) {
            // write your code here
            List<Interval> result = new ArrayList<Interval>();
            int count = 1;
            if(intervals.size()==0||intervals.size()==1) {
                return intervals;
            }
            else {
                Collections.sort(intervals, new IntervalComparator()); 
                Interval prev = intervals.get(0);
                for(int i=1; i<intervals.size(); i++) {
                    if(intervals.get(i).start <= prev.end) {
                        prev.end = Math.max(prev.end, intervals.get(i).end);
                    }
                    else {
                        result.add(prev);
                        prev = intervals.get(i);
                    }
                }
                result.add(prev);
                return result;
            }
           
        }
    class IntervalComparator implements Comparator<Interval> {  
        public int compare(Interval i1, Interval i2) {  
        return i1.start - i2.start;  
        }
    }

}
