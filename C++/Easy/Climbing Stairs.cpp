class Solution {
public:
    /**
     * @param n: An integer
     * @return: An integer
     */
    int climbStairs(int n) {
        // write your code here
        if(n<=0) {
            return 0;
        }
        if(n == 1 || n == 2) {
            return n;
        }
        int one = 1, two = 2, ret = 3;
        for(int i=3; i<=n; i++) {
            ret = one + two;
            one = two;
            two = ret;
        }
        return ret;
    }
};
