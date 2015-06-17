public class Solution {
    /**
     * @param A an integer array
     * @return  A list of integers includes the index of the first number and the index of the last number
     */
    public ArrayList<Integer> continuousSubarraySum(int[] A) {
        // Write your code here
        
    int sum = A[0];
    int max = A[0];
    int start = 0;
    ArrayList<Integer> myList = new ArrayList<Integer>();
    myList.add(0);
    myList.add(0);
    for(int i=1; i<A.length; i++) {
        if(sum<0 ) {
            start = i;
            sum = 0;
            }
           sum = sum + A[i]; 
        if(sum>=max) {
            myList.set(0,start);
            myList.set(1,i);
            max = sum;
        }
    }
    return myList;
        
    }
}
