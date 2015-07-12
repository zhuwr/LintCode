public class Solution {
    /**
     * @param grid: a list of lists of integers.
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    public int minPathSum(int[][] grid) {
        // write your code here
        if(grid == null || grid.length == 0 || grid[0].length ==0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[][] sum = new int[m][n];
        sum[0][0] = grid[0][0];
        int i,j;
        for(i=1; i<m; i++) {
            sum[i][0] = sum[i-1][0] + grid[i][0];
        }
        for(i=1; i<n; i++) {
            sum[0][i] = sum[0][i-1] + grid[0][i];
        }
        
        for(i=1; i<m; i++) {
            for(j=1; j<n; j++) {
                sum[i][j] = Math.min(sum[i-1][j],sum[i][j-1])+grid[i][j];
            }
        }
        return sum[m-1][n-1];
    }
}

