import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> queue = new LinkedList<>();
        
        for(int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{i, priorities[i]});
        }
        
        while(!queue.isEmpty()) {
            boolean isFirst = true;
            int[] process = queue.poll();
            
            for(int[] q : queue) {
                if(process[1] < q[1]) {
                    isFirst = false;
                    break;
                }
            }
            
            // 우선순위가 1번이면
            if(isFirst) {
                answer++;
                if(process[0] == location) return answer;
            } else {
                queue.add(process);
            }
        }
        
        return answer;
    }
}