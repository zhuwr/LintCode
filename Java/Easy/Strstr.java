class Solution {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String source, String target) {
        //write your code here
        if(source==null || target==null) {
            return -1;
        }
        if(source.length() < target.length()) {
            return -1;
        }
        
        if(target.length()==0) {
            return 0;
        }
        int length = source.length() - target.length();

        for(int i=0; i<length; i++) {
            if(source.charAt(i) == target.charAt(0)) {
                boolean flag = isTrue(source, target,i);
                if(flag == true) {
                    return i;
                }
            }
        }
        return -1;
    }
    public boolean isTrue(String source, String target, int i) {
        for(int j=0; j<target.length(); j++) {
            if(source.charAt(j+i) != target.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
