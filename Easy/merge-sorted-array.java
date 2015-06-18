class Solution {
    /**
     * @param A: sorted integer array A which has m elements, 
     *           but size of A is m+n
     * @param B: sorted integer array B which has n elements
     * @return: void
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        int i = m-1;
        int j = n-1;
        int index = m+n-1;
        int k=0;
        
        while(i>=0 && j>=0) {
            if(A[i] > B[j]) {
                A[index--] = A[i--];
            }else {
                A[index--] = B[j--];
            }
        }
        while(i>=0) {
            A[index--] = A[i--];
        }
        while(j>=0) {
            A[index--] = B[j--];
        }
    }
}
