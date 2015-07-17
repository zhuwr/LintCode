public class Solution {
    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        if(A.length() < B.length()) return false;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if(map.containsKey(c)) {
                int value = map.get(c);
                map.put(c, ++value);
            }else {
                map.put(c, 1);
            }
        }

        for(int i = 0; i < B.length(); i++) {
            char c = B.charAt(i);
            if(map.containsKey(c)) {
                int value = map.get(c);
                if(--value < 0) {
                    return false;
                }
                map.put(c, value);
            }else {
                return false;
            }
        }
        return true;
        
    }
}
