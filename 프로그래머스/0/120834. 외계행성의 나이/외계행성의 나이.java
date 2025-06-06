import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public String solution(int age) {
        String answer = "";
        Deque<Character> que = new LinkedList<>();
        
        while(age > 0) {
            char ch = (char) ('a' + age % 10);
            age /= 10;
            
            que.addFirst(ch);
        }
        
        while(!que.isEmpty()) {
            answer += que.pollFirst();
        }
        
        return answer;
    }
}