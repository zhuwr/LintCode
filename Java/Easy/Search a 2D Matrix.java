public class Solution {
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if(matrix.length <=0 || matrix[0].length <= 0) {
            return false;
        }
        int startX = 0;
        int endX = matrix.length-1;
        int startY = 0;
        int endY = matrix[0].length-1;
        while(endX - startX>1) {
            int midX = (startX+endX)>>1;
            if(target == matrix[midX][0]) {
                return true;
            } else if(target < matrix[midX][0]) {
                endX = midX - 1;
            } else {
                startX = midX;
            }
        }
        if(matrix[endX][0]<target) {
            startX = endX;
        }
        
        while(endY - startY >1) {
            int midY = (startY+endY)>>1;
            if(target == matrix[startX][midY]) {
                return true;
            } else if(target < matrix[startX][midY]) {
                endY = midY - 1;
            } else {
                startY = midY + 1;
            }
        }
        return (target == matrix[startX][startY] || target == matrix[startX][endY]);
    }
}
