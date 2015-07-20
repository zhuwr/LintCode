public class Solution {
    /**
     * @param n the integer to be reversed
     * @return the reversed integer
     */
    public int reverseInteger(int n) {
        // Write your code here
        int ret = 0;
        int a,sum;
        while(n !=0) {
            a = n%10;
            n = n/10;
            sum = ret*10 + a;
            if(sum/10 !=ret) {
                return 0;
            }
            ret = sum;
        }
        return ret;
    }
}
