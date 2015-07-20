// 1844ms
public class Solution {
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
        int oldone = 1;
        int newone = 1;
        int count = nums.length;
        while(oldone<nums.length){
                if(nums[oldone-1] == nums[oldone]) {
                    oldone++;
                    count--;
                }
                else{
                    nums[newone++] = nums[oldone++];
                }
            }
        return count;
    }
}
