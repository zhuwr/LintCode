class Solution {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        // write your code here
        long ret = 0;
        long pow = -1;
        while(pow <= x) {
            ret +=1;
            pow = ret * ret;
            
        }
        return (int)(ret-1);
    }
}
