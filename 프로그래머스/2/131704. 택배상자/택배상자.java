import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        // 택배 상자 1~n
        // 맨 앞의 상자만 뺄 수 있습니다 -> stack
        int idx = 0;
        for(int i = 1; i <= order.length; i++) {
            // 보조 벨트에 상자 넣기
            stack.push(i);
            
            // 기사가 알려준 순서대로 벨트에서 뺄 수 있을 만큼 계속 상자 빼기
            while(!stack.isEmpty() && stack.peek() == order[idx]) {
                stack.pop();
                idx++;
                answer++;
            }
        }
        
        return answer;
    }
}