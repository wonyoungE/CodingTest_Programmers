import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        for(String key : map.keySet()) {
            answer *= (map.get(key) + 1); // +1 => 안입는 경우 
        }
        
        return answer - 1;  // 아무것도 안 입는 경우 제외
    }
}