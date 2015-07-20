public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number 
     *          and the index of the last number
     */
    public ArrayList<Integer> subarraySum(int[] nums) {
        // write your code here
        int length = nums.length;
        int i = 0;
        int sum = 0;
        ArrayList<Integer> ret = new ArrayList<Integer>();
        
        while(i<length) {
            sum = nums[i];
            if(sum == 0) {
                ret.add(i);
                ret.add(i);
                return ret;
            }
            int j = i+1;
            while(j<length) {
                sum+=nums[j];
                if(sum == 0) {
                    ret.add(i);
                    ret.add(j);
                    return ret;
                }
                j++;
            }
            i++;
        }
        return ret;
    }
}
