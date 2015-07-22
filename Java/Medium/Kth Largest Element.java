class Solution {
    //param k : description of k
    //param numbers : array of numbers
    //return: description of return
    public int kthLargestElement(int k, ArrayList<Integer> numbers) {
        // write your code here
        if(k<=0 || numbers.size()<k) {
            return -1;
        }
        int start = 0, end = numbers.size()-1;
        int index = 0;
        while(index !=k-1) {
            index = Partition(numbers,start,end);
            if(index < k-1) {
                start = index + 1;
            } else if(index > k-1) {
                end = index - 1;
            } else {
                    return numbers.get(index);
            }
        }
        return -1;
    }
    
    public int Partition(ArrayList<Integer> numbers,int start,int end) {
        int mid = (start+end)/2;
        int value = numbers.get(mid);
        swap(numbers, mid, end);
        int index = start - 1;
        for(int i= start; i<end; i++) {
            if(numbers.get(i) > value) {
                ++index;
                if(index != i) {
                    swap(numbers, i, index);
                }
            }
        }
        ++index;
        swap(numbers, index, end);
        return index;
    }
    
    public void swap(ArrayList<Integer> numbers,int m,int n) {
        int temp = numbers.get(m);
        numbers.set(m, numbers.get(n));
        numbers.set(n, temp);
    }
   
};
