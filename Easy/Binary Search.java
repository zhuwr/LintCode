class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        //write your code here
        if(nums.length <=0) {
            return -1;
        }
        if(nums.length == 1 && nums[0] == target) {
            return 0;
        }
        int start = 0;
        int end = nums.length-1;
        int mid;
        while(start<=end) {
            mid = (start + end)/2;
            if(nums[mid] == target) {
                while(mid >=1 && nums[mid-1] == target) {
                    mid--;
                }
                return mid;
                
            } else if(nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return -1;
    }
}
