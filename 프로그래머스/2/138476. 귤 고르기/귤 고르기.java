import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        
        // 크기 별 개수 순으로 내림차순 정렬
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        
        int idx = 0;
        while(k > 0) {
           answer++;
           k -= list.get(idx++);
        }
        
        return answer;
    }
}