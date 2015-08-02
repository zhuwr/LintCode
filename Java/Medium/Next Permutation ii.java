public class Solution {
    /**
     * @param nums: an array of integers
     * @return: return nothing (void), do not return anything, modify nums in-place instead
     */
    public void nextPermutation(int[] nums) {
        // write your code here
    if (nums == null) {
            return;
        }
        
        int len = nums.length;
        for (int i = len - 2; i >= 0; i--) {
            if (nums[i + 1] > nums[i]) {
                int j;
                for (j = len - 1; j > i - 1; j--) {
                    if (nums[j] > nums[i]) {
                        break;
                    }
                }

                swap(nums, i, j);
                reverse(nums, i + 1, len-1);
                return;
            }
        }

        reverse(nums, 0, len-1);
    }

    void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    void reverse(int[] nums, int beg, int end) {
        for (int i = beg, j = end; i < j; i ++, j --) {
            swap(nums, i, j);
        }
    }
}
