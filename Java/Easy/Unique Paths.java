public class Solution {
    /**
     * @param n, m: positive integer (1 <= n ,m <= 100)
     * @return an integer
     */
    public int uniquePaths(int m, int n) {
        // write your code here 
        if(m == 1 || n == 1) {
            return 1;
        }
        int[][] num = new int[m][n];
        int i,j;
        for(i=0; i<m; i++) {
            num[i][0]=1;
        }
        for(j=0; j<n; j++) {
            num[0][j]=1;
        }
        for(i=1; i<m; i++) {
            for(j=1; j<n; j++) {
                num[i][j]=num[i-1][j] + num[i][j-1];
            }
            
        }
        return num[m-1][n-1];
        
    }
}

