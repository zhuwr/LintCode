public class Solution {
	/**
	 *@param A : an integer array
	 *return : a integer 
	 */
    public int singleNumber(int[] A) {
        if(A == null || A.length == 0) {
            return 0;
        }
        int rst = 0;
        for (int i = 0; i < A.length; i++) {
            rst ^= A[i];
        }
        return rst;
    }
}
