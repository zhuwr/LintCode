// 1481ms
public class Solution {
    /**
     * @param nums: The rotated sorted array
     * @return: void
     */
    public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
        // write your code
        int index = 0;
        for(int i=0; i<nums.size()-1; i++) {
            if(nums.get(i) > nums.get(i+1)) {
                index = i;
            }
        }
        if(index !=0) {
        reverse(nums,0,index);
        reverse(nums,index+1,nums.size()-1);
        reverse(nums,0,nums.size()-1);
        }
    }
    
    public void reverse(ArrayList<Integer> nums, int start, int end) {
        while(start<end) {
            swap(nums,start++,end--);
        }
    }
    
    public void swap(ArrayList<Integer> nums, int a,int b) {
        int temp;
        temp = nums.get(a);
        nums.set(a, nums.get(b));
        nums.set(b,temp);
    }
    
}
