import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        
        // 다른 종류가 최소 -> map을 value 기준으로 내림차순 정렬
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, (o1, o2) -> (o2 - o1));
        
        int idx = 0;
        while(k > 0) {
            k -= list.get(idx++);
            answer++;
        }
        
        return answer;
    }
}