import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for(int i = 0; i < s.length(); i++) {
            String rotate = s.substring(i) + s.substring(0, i);
            
            answer += isValid(rotate) ? 1 : 0;
        }
        
        return answer;
    }
    
    private boolean isValid(String rotate) {
        Stack<Character> stack = new Stack<>();
    
        for(int i = 0; i < rotate.length(); i++) {
            char c = rotate.charAt(i);
            
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false;
                
                char last = stack.pop();
                if(last == '(' && c != ')') return false;
                if(last == '[' && c != ']') return false;
                if(last == '{' && c != '}') return false;
            }
        }
        
        return stack.isEmpty();
    }
}