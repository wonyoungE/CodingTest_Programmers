import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int match = 0;
        int zero = 0;
        Map<Integer, Integer> rank = new HashMap<>();
        rank.put(6, 1); rank.put(5, 2); rank.put(4, 3);
        rank.put(3, 4); rank.put(2, 5); rank.put(1, 6); rank.put(0, 6);
        
        for(int l : lottos) {
            if(l == 0) {
                zero++;
            }
            for(int w : win_nums) {
                if(l == w) {
                    match++;
                }
            }
        }
        
        answer[0] = rank.get(zero+match);
        answer[1] = rank.get(match);
        
        return answer;
    }
}