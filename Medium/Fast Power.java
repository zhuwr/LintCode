class Solution {
    /*
     * @param a, b, n: 32bit integers
     * @return: An integer
     */
    public int fastPower(int a, int b, int n) {
        // write your code here
        if(n == 0) {
            return 1%b;
        }
        if(n == 1) {
            return a%b;
        }
        
        long pow = fastPower(a,b,n/2);
        pow = (pow*pow)%b;
        if(n%2 == 1) {
            pow = pow*a%b;
        }
        
        return (int)pow;
    }
};
