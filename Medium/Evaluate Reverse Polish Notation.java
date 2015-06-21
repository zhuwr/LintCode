public class Solution {
    /**
     * @param tokens The Reverse Polish Notation
     * @return the value
     */
    public int evalRPN(String[] tokens) {
        // Write your code here
        Stack<Integer> myStack = new Stack<Integer>();
        String count = "+-*/";
        for(String s:tokens) {
            if(count.contains(s)) {
                int second = myStack.pop(); 
                int first = myStack.pop(); 
                if(s.equals("+")) {
                    int result = first + second;
                    myStack.push(result);
                }
                if(s.equals("-")) {
                    int result = first - second;
                    myStack.push(result);
                }
                if(s.equals("*")) {
                    int result = first * second;
                    myStack.push(result);
                }
                if(s.equals("/")) {
                    int result = first/second;
                    myStack.push(result);
                }
            }
            else {
                myStack.push(Integer.parseInt(s));
            }
        }
        return myStack.peek();
    }
}
