public class Solution {
    /**
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(ArrayList<Integer> nums) {
        // write your code
        int count = 1;
        int maxNum = nums.get(0);
        int size = nums.size();
        int i = 1;
        while(i< size) {
            if(nums.get(i)==maxNum) {
                count++;
            } else {
                count--;
            }
            if(count==0){
                maxNum = nums.get(i);
                count = 1;
            }
            i++;
        }
        return maxNum;
    }
}

