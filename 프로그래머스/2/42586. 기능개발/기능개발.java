import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i < progresses.length; i++) {
            queue.add((int)Math.ceil((100.0 - progresses[i]) / speeds[i]));
        }
        
        while(!queue.isEmpty()) {
            int cnt = 0;
            int tmp = queue.peek();
            
            while(!queue.isEmpty() && queue.peek() <= tmp) {
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