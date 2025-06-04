import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> runner = new HashMap<>();
        
        // 동명이인이 있을 수 있으므로 key(참가자 이름)이 있으면 value+1 아니면 0+1
        for(String player : participant) {
            runner.put(player, runner.getOrDefault(player, 0) + 1);
        }
        
        // 완주한 사람 이름(key)로 value-1
        for(String player : completion) {
        	runner.put(player, runner.getOrDefault(player, 0) - 1);
        }
        
        // map에 있는 이름을 하나씩 순회하면서 0이 아닌 value가 있으면 반환
        for(String key : runner.keySet()) {
            if(runner.get(key) != 0) {
                answer = key;
            }
        }
        
        return answer;
    }
}