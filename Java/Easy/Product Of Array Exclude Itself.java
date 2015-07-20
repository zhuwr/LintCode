public class Solution {
    /**
     * @param A: Given an integers array A
     * @return: A Long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        // write your code
        int size = A.size();
        ArrayList<Long> result = new ArrayList<Long>();
        if(A == null ) {
            return result;
        }
        for(int i=0; i<size; i++) {
            long ret = 1;
            for(int j=0; j<size; j++) {
                if(j!=i) {
                    ret *= A.get(j);
                }
            }
            result.add(ret);
        }
        return result;
    }
}

