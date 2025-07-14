import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for(String calling : callings) {
            // 추월한 사람의 원래 등수
            int idx = map.get(calling);
            
            String front = players[idx-1];
            players[idx] = front;
            players[idx-1] = calling;
            
            map.put(front, idx);
            map.put(calling, idx-1);
        }

        return players;
    }
}