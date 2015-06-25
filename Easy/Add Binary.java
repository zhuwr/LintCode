public class Solution {
    /**
     * @param a a number
     * @param b a number
     * @return the result
     */
    public String addBinary(String a, String b) {
        // Write your code here
        int numa = Integer.parseInt(a);
        int numb = Integer.parseInt(b);
        
        int sum;
        sum = convert(numa) + convert(numb);
        
        String ret = String.valueOf(con(sum));
        return ret;
    }
    
    int convert(int a) {
        int count = 1;
        int sum = 0;
        while(a !=0) {
            sum = sum + a%10*count;
            count = count*2;
            a= a/10;
            
        }
        
        return sum;
    }
    int con(int a) {
        int count = 1;
        int sum = 0;
        while(a != 0) {
            sum = sum + a%2 *count;
            count = count*10;
            a = a/2;
        }
        return sum;
    }
}
