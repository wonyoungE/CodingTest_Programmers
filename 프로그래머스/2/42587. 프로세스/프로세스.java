import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> queue = new LinkedList<>();
        
        for(int i = 0; i < priorities.length; i++) {
            queue.add(new int[] {i, priorities[i]});
        }
        
        while(!queue.isEmpty()) {
            int[] first = queue.poll();
            boolean hasHigher = false;
            
            for(int[] p : queue) {
                if(first[1] < p[1]) {
                    hasHigher = true;
                    break;
                }
            }
            
            if(hasHigher) {
                queue.add(first);
            } else {
                answer++;
                if(first[0] == location) {
                    return answer;
                }
            }
        }
        
        return answer;
    }
}