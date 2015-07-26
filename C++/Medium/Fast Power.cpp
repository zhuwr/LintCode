class Solution {
public:
    /*
     * @param a, b, n: 32bit integers
     * @return: An integer
     */
    int fastPower(int a, int b, int n) {
        // write your code here
        if(n ==0) {
            return 1%b;
        }
        if(n == 1) {
            return a%b;
        }
        long ret = fastPower(a, b, n/2);
        ret = ret * ret%b;
        if(n%2 == 1) {
            ret = ret * a%b;
        }
        return int(ret);
    }
};
