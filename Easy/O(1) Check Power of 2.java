class Solution {
    /*
     * @param n: An integer
     * @return: True or false
     */
    public boolean checkPowerOf2(int n) {
        // write your code here
        int index = 0;
        
        while(n > Math.pow(2,index)) {
            index++;
        }
        if(n == Math.pow(2,index)) {
                return true;
        } else {
            return false;
        }
    }
};
