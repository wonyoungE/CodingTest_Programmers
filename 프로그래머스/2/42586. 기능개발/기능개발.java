import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        
        // 각 기능마다 걸리는 일수 구하기
        for(int i = 0; i < progresses.length; i++) {
            queue.add((int)Math.ceil((100.0 - progresses[i]) / speeds[i]));
        }
        
        while(!queue.isEmpty()) {
            int count = 0;
            int maxDay = queue.peek();
            
            while(!queue.isEmpty() && maxDay >= queue.peek()) {
                queue.poll();
                count++;
            }
            
            list.add(count);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}