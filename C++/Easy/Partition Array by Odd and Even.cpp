class Solution {
public:
    /**
     * @param nums: a vector of integers
     * @return: nothing
     */
    void partitionArray(vector<int> &nums) {
        // write your code here
        if(nums.size() ==0) {
            return;
        }
        int start=0, end = nums.size()-1; 
        while(start < end) {
            if(nums[start]%2 == 1) {
                start++;
            } else {
                int temp = nums[end];
                nums[end] = nums[start];
                nums[start] = temp;
                end--;
            }
        }
    }
};
