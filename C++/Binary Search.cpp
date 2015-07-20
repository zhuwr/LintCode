class Solution {
public:
    /**
     * @param nums: The integer array.
     * @param target: Target number to find.
     * @return: The first position of target. Position starts from 0. 
     */
    int binarySearch(vector<int> &array, int target) {
        // write your code here
        
        int start = 0;
        int end = array.size() - 1;
        
        while(start <= end) {
            int mid = (start + end) /2;
            if(array[mid] == target) {
                while(mid>=1 && array[mid-1] == target) {
                    mid --;
                }
                return mid;
            } else if(array[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return -1;
    }
};
