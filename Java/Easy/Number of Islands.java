public class Solution {
    /**
     * @param grid a boolean 2D matrix
     * @return an integer
     */
    public int numIslands(boolean[][] grid) {
        // Write your code here
        
        int m = grid.length;
        if(m==0 ) {
            return 0;
        }
        int n = grid[0].length;
        if( n==0) {
            return 0;
        }
        int i,j,count=0;
        for(i=0; i<m; i++) {
            for(j=0; j<n; j++) {
                if(grid[i][j] == true) {
                    toZero(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    
    public void toZero(boolean[][] grid, int a, int b) {
        grid[a][b] = false;
        int i,j;
        if(a-1>=0 && grid[a-1][b]==true) {
            toZero(grid,a-1,b);
        }
        if(b-1>=0 && grid[a][b-1]==true) {
            toZero(grid,a,b-1);
        } 
        if(a+1<grid.length && grid[a+1][b]==true) {
            toZero(grid,a+1,b);
        }
        if(b+1<grid[0].length&& grid[a][b+1]==true) {
            toZero(grid,a,b+1);
        } 
    }
}
