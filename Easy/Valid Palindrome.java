public class Solution {
    /**
     * @param s A string
     * @return Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        // Write your code here
        if(s == null || s.length()==1) {
            return true;
        }
        int start = 0, end = s.length()-1;
        while(start<end) {
            while(start<s.length()-1 &&!isValid(s.charAt(start))) {
                start++;
            }
            if(start == s.length()-1) {
                return true;
            }
            while(end>0 && !isValid(s.charAt(end))) {
                end--;
            }
            if(Character.toLowerCase(s.charAt(start)) == Character.toLowerCase(s.charAt(end))) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return end <= start; 
    }
    public boolean isValid(char c) {
        return Character.isLetter(c) || Character.isDigit(c);
    }
}

