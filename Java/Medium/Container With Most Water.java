public class Solution {
    /**
     * @param heights: an array of integers
     * @return: an integer
     */
    public int maxArea(int[] heights) {
        // write your code here
        int max = 0;
        int area;
        for(int i=0; i<heights.length; i++) {
            for(int j=i+1; j<heights.length; j++) {
                area = (j-i)*Math.min(heights[i], heights[j]);
                if(area > max) {
                    max = area;
                }
            }
            
        }
        return max;
    }
}
