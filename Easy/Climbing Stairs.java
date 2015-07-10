public class Solution {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        // write your code here
        if(n <= 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }

        int sum = 0;
        int one = 0;
        int two = 1;
        for(int i = 1; i<=n; i++) {
            sum = one + two;
            one = two;
            two = sum;
        }
        return sum;
    }
}
