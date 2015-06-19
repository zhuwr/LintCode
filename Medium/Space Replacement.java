public class Solution {
    /**
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public int replaceBlank(char[] string, int length) {
        // Write your code here
        int count = 0;
        for(int i=0; i<length; i++) {
            if(string[i] == ' ') {
                count++;
            }
        }
        if(count == 0) {
            return length;
        }
        int pOld = length;
        length = length + count*2;
        int pNew = length;
        
        while(pOld >= 0) {
            if(string[pOld] == ' ') {
                string[pNew] = '0';
                string[pNew-1] = '2';
                string[pNew-2] = '%';
                pNew = pNew-3;
                pOld--;
            } else {
                string[pNew--] = string[pOld--];
                
            }
        }
        return length;
    }
}
