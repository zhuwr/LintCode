// 1832ms
public class Solution {
    /**
     * @param str: a string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        // write your code here
        int flag = 0;
        int i,j;
        for(i=0; i<str.length(); i++) {
         for(j=i+1; j<str.length(); j++) {
             if(str.charAt(i) == str.charAt(j)) {
                 flag = 1;
                 break;
             }
         }   
        }
        
        if(flag == 1) {return false;
        }
        else{return true;
            
        }
    }
}
