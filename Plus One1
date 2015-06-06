public class Solution {
    /**
     * @param digits a number represented as an array of digits
     * @return the result
     */
    public int[] plusOne(int[] digits) {
        // Write your code here
        int Value = 0;
        int[] ret = new int[digits.length];
        int flag = 1;
            for(int i=digits.length-1; i>=0; i--) {
                digits[i] = digits[i] +flag;
                if(digits[i] == 10) {
                    digits[i] = 0;
                    flag = 1;
                } else {
                    flag = 0;
                }
            }
            
            if(flag == 1) {
                int[] newdigit = new int[digits.length+1];
                newdigit[0] = 1;
                for(int j=1; j<=digits.length; j++) {
                    newdigit[j] = 0;
                }
                return newdigit;
            } else {
                return digits;
            }
    }
}
