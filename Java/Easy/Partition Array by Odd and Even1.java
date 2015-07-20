public class Solution {
    /**
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        // write your code here;
        int i = 0;
        int j = 0;
        int k = 0;
        int[] numsb = new int[nums.length];
        for(i=0; i<nums.length; i++) {
            if(nums[i]%2 == 1) {
                numsb[j] = nums[i];
                j = j + 1;
            }
            else {
                numsb[nums.length-k-1] = nums[i];
                k = k + 1;
            }                       
        }       
        for(i=0; i<nums.length; i++) {
            nums[i] = numsb[i];
        }

    }
}
