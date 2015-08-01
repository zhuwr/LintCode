public class Solution {
    /**
     * @param obstacleGrid: A list of lists of integers
     * @return: An integer
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // write your code here
        if(obstacleGrid.length ==0 ||obstacleGrid[0].length ==0) {
            return 0;
        }
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] num = new int[m][n];
        if(obstacleGrid[0][0] == 1) {
                return 0;
            } else {
                num[0][0] = 1;
            }
        
        for(int i=1; i<m; i++) {
            if(obstacleGrid[i][0] == 1) {
                num[i][0] = 0;
            } else {
                num[i][0] = num[i-1][0];
            }
            
        }
        for(int j=1; j<n; j++) {
            if(obstacleGrid[0][j] == 1) {
                num[0][j] = 0;
            } else {
                num[0][j] = num[0][j-1];
            }
        }
        
        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                if(obstacleGrid[i][j] == 1) {
                    num[i][j] = 0;
                } else {
                    num[i][j] = num[i-1][j] + num[i][j-1];
                }
            }
        }
        return num[m-1][n-1];
    }
}
