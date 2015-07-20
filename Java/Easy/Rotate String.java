public class Solution {
    /*
     * param A: A string
     * param offset: Rotate string with offset.
     * return: Rotated string.
     */
    public char[] rotateString(char[] A, int offset) {
        // wirte your code here
        int length = A.length;
        if(length==0||length==1||offset == 0) {
            return A;
        }
        if(offset >= length) {
            offset = offset%length;
        }
        swap(A, length-offset, length-1);
        swap(A, 0, length-1-offset);
        swap(A, 0, length-1);
        return A;
    }
    
    public void swap(char[] A, int left, int right) {
        
        while(left <right) {
            char temp = A[left];
            A[left] = A[right];
            A[right] = temp;
            left++;
            right--;
        }
    }
    
};
