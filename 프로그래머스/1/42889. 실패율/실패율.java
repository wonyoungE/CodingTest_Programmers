import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {        
        int[] totalCnt = new int[N+1]; // 스테이지에 도달한 플레이어 수
        int[] currentCnt = new int[N+1];  // 클리어하지 못하고 있는 플레이어 수
        
        for(int i = 0; i < stages.length; i++) {
            for(int j = 0; j < stages[i]; j++) {
                totalCnt[j]++;
            }
            currentCnt[stages[i] - 1]++;
        }
        
        // 스테이지 번호, 실패율
        Map<Integer, Double> map = new HashMap<>();
        for(int i = 0; i < N; i++) {
            if(totalCnt[i] == 0 || currentCnt[i] == 0) {
                map.put(i+1, 0.0);
            } else {
                map.put(i+1, (double)currentCnt[i] / (double)totalCnt[i]);
            }
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        
        list.sort((o1, o2) -> Double.compare(map.get(o2), map.get(o1)));
        
        return list.stream().mapToInt(i->i).toArray();
    }
}