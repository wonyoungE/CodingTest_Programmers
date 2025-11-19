import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        // -1로 초기화
        Arrays.fill(answer, -1);
        
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        
        for(int i = 1; i < numbers.length; i++) {
            int num = numbers[i];
            
            while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.pop()] = num;
            } 
            
            stack.push(i);
        }
        
        return answer;
    }
}