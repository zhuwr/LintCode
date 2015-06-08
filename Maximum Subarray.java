// 3169ms
public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(ArrayList<Integer> nums) {
        // write your code
        int maxSum = nums.get(0);
        int preSum = maxSum;
        
        for(int i=1; i<nums.size(); i++) {
            
            preSum = Math.max(nums.get(i), nums.get(i)+preSum);
            maxSum = Math.max(preSum, maxSum);
        }
        return maxSum;
    }
}
