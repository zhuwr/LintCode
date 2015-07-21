public class Solution {
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        // write your code here
        if(s.length()!=t.length()) {
            return false;
        }
        int[] map = new int[256];
        for(int i=0; i<s.length(); i++) {
            map[(int)s.charAt(i)]++;
        }
        for(int i=0; i<t.length(); i++) {
            map[(int)t.charAt(i)]--;
            if(map[(int)t.charAt(i)]<0) {
                return false;
            }
        }
        return true;
    }
};
