import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        Map<Character, Integer> map = new HashMap<>();
        for(String key : keymap) {
            for(int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                
                // map에 없는 경우, map에 저장된 눌러야하는 최소값이 i+1보다 큰 경우
                if(map.getOrDefault(c, 0) == 0 || map.get(c) > i + 1) {
                    map.put(c, i+1);
                }
            }
        }
        
        for(int i = 0; i < targets.length; i++) {
            int cnt = 0;
            String target = targets[i];
            boolean isAvailable = true;
            for(int j = 0; j < target.length(); j++) {
                char c = target.charAt(j);
                if(map.getOrDefault(c, 0) == 0) {
                    answer[i] = -1;
                    isAvailable = false;
                    break;
                } else {
                    cnt += map.get(c);
                }
            }
            if(isAvailable) answer[i] = cnt;
            else answer[i] = -1;
        }
        
        return answer;
    }
}