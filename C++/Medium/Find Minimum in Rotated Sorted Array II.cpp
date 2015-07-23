class Solution {
public:
    /**
     * @param num: the rotated sorted array
     * @return: the minimum number in the array
     */
    int findMin(vector<int> &num) {
        // write your code here
        for(int i=0; i<num.size()-1; i++) {
            if(num[i]> num[i+1]) {
                return num[i+1];
            }
            
        }
        return num[0];
    }
};
