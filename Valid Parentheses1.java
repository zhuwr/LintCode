// 13591ms
public class Solution {
    /**
     * @param s A string
     * @return whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
        // Write your code here
        Stack<Character> MyStack = new Stack<Character>();
        int flag = 0;
        for(char c: s.toCharArray()) {
            if(c == '(' ||c == '[' ||c == '{') {
                MyStack.push(c);
            }
            else if(c == ')' && !MyStack.isEmpty() && MyStack.peek() == '(') {
                MyStack.pop();
            }
            else if(c == ']'&& !MyStack.isEmpty() && MyStack.peek() == '[') {
                MyStack.pop();
            }
            else if(c == '}'&& !MyStack.isEmpty() && MyStack.peek() == '{') {
                MyStack.pop();
            }
            else {
                flag = 1;
            }
        }
        if(!MyStack.isEmpty()) {
            flag = 1;
        }
        if(flag == 0 ) {
            return true;
        }else {
            return false;
        }
            
        }
        
    }

