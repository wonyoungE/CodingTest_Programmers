import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for(int i : scoville) {
            queue.add(i);
        }
        
        int newScoville = 0;
        while(queue.size() > 0 && queue.peek() < K) {
            if(queue.size() < 2) {
                return -1;
            }
            
            newScoville = queue.poll() + (queue.poll() * 2);
            queue.add(newScoville);
            answer++;
        }
        
        return answer;
    }
}