class Solution{
public:
    /**
     * @param n: an integer
     * @return an integer f(n)
     */
    int fibonacci(int n) {
        // write your code here
        if(n == 1 || n == 2) {
            return n-1;
        }
        int ret = 0, left = 0, right = 1;
        for(int i=3; i<=n; i++) {
            ret = left + right; 
            left = right;
            right = ret;
        }
        
        return ret;
    }
};

