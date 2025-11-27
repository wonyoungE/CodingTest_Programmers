import java.util.*;

class Solution {
    public int solution(String s) {
        Stack<String> stack = new Stack<>();
        
        for(String alphabet : s.split("")) {
            if(stack.isEmpty()) {
                stack.push(alphabet);
                continue;
            } 
            if(stack.peek().equals(alphabet)) {
                stack.pop();
            } else {
                stack.push(alphabet);
            }
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
}