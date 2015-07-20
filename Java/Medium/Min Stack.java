public class Solution {
    Stack<Integer> myStack = new Stack<Integer>();
    Stack<Integer> helper = new Stack<Integer>();
    public Solution() {
        // do initialize if necessary
    }

    public void push(int number) {
        // write your code here
        myStack.push(number);
        if(helper.isEmpty()) {
            helper.push(number);
        }
        else if(number<helper.peek()) {
            helper.push(number);
        }else {
            helper.push(helper.peek());
        }
    }

    public int pop() {
        // write your code here
        helper.pop();
        return myStack.pop();
    }

    public int min() {
        // write your code here
        return helper.peek();
    }
}

