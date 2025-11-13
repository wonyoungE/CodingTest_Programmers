import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        // 각 기능마다 걸리는 일 수 계산
        for(int i = 0; i < progresses.length; i++) {
            int days = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            queue.add(days);
        }
        
        while(!queue.isEmpty()) {
            int cnt = 0;
            int tmp = queue.peek();
            
            while(!queue.isEmpty() && tmp >= queue.peek()) {
                cnt++;
                queue.poll();
            }
            
            list.add(cnt);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}