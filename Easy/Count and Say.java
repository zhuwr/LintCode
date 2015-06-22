public class Solution {
    /**
     * @param n the nth
     * @return the nth sequence
     */
    public String countAndSay(int n) {
        // Write your code here
        String old = "1"; 
        int count;
        while(--n >0) {
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<old.length(); i++) {
                count = 1;
                while((i+1)<old.length() && old.charAt(i)==old.charAt(i+1)) {
                    count++;
                    i++;
                }
                sb.append(String.valueOf(count)+old.charAt(i));
                
            }
            old = sb.toString();
        }
        return old;
    }
}
