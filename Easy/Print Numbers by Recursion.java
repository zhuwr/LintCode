public class Solution {
    /**
     * @param n: An integer.
     * return : An array storing 1 to the largest number with n digits.
     */
    public List<Integer> numbersByRecursion(int n) {
        // write your code here
        ArrayList<Integer> myList = new ArrayList<Integer>();
        int largenum=1;
        for(int i=0; i<n; i++) {
            largenum *= 10;
        }
        
        for(int i=1; i<largenum; i++) {
            myList.add(i);
        }
        return myList;
    }
}
