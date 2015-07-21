class Solution {
    /*
     * param k : As description.
     * param n : As description.
     * return: An integer denote the count of digit k in 1..n
     */
    public int digitCounts(int k, int n) {
        // write your code here
        int sum = 0;
        for(int i=0; i<=n; i++) {
            sum = sum + Count(k, i);
        }
        return sum;
    }
    public int Count(int k, int i) {
        int ret = 0;
        while(i != 0) {
            if(i%10 == k) {
                ret++;
            }
            i=i/10;
            
        }
        return ret;
    }
};

