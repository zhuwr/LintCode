class Solution {
public:
    /**
     * @param matrix: A list of lists of integers
     * @param target: An integer you want to search in matrix
     * @return: An integer indicate the total occurrence of target in the given matrix
     */
    int searchMatrix(vector<vector<int> > &matrix, int target) {
        // write your code here
        
        int m = matrix.size() - 1;
        if(m<0) {
            return 0;
        }
        int n = matrix[0].size() - 1;
        if( n<0) {
            return 0;
        }
        return search(matrix, 0, m, 0, n, target);
    }
    
    int search(vector<vector<int> > &matrix, int startX, int endX, int startY, int endY, int target) {
        if(endX < startX || endY < startY) {
            return 0;
        }
        int count = 0;
        if(matrix[startX][endY]<target) {
            return search(matrix, startX+1, endX, startY, endY, target);
        } else {
            if(matrix[startX][endY] == target) {
                count++;
            }
            return count+search(matrix, startX, endX, startY, endY-1, target);
        }
        
        
    }
    
    
    
};

