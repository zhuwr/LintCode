class Solution {
    /**
     * @param k: The number k.
     * @return: The kth prime number as description.
     */
    public long kthPrimeNumber(int k) {
        // write your code here
        if(k<=0) {
            return 0;
        }
        int count = 1;
        long[] ugly = new long[k+1];
        ugly[0] = 1;
        int index3 = 0;
        int index5 = 0;
        int index7 = 0; 
        
        while(count<=k) {
            ugly[count] = Min(ugly[index3]*3,ugly[index5]*5,ugly[index7]*7);
            if(ugly[index3]*3 <=ugly[count]) {
                index3++;
            }
            if(ugly[index5]*5 <=ugly[count]) {
                index5++;
            }
            if(ugly[index7]*7 <=ugly[count]) {
                index7++;
            }
            count++;
        }
        
        return ugly[count-1];
        
    }
    public long Min(long a, long b, long c) {
        if(a < b) {
            return a < c? a:c;
        } else {
            return b < c? b:c;
        }
    }
  
};

