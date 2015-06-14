public class Solution {
    /**
     * @param path the original path
     * @return the simplified path
     */
    public String simplifyPath(String path) {
        // Write your code here
        
        String ret = "/";
        String[] paths = path.split("/");
        ArrayList<String> result = new ArrayList<String>();
        for(String s:paths) {
            if(s.equals("..")) {
                if(result.size()>0) {
                result.remove(result.size()-1);
                }
            }
            else if(!s.equals(".") && !s.equals("")) {
                result.add(s);
            }
        }
        for(String s:result) {
            ret = ret + s + "/";
        }
        if (ret.length() > 1) {
            ret = ret.substring(0, ret.length() - 1);
        }
        return ret;
        
    }
}
