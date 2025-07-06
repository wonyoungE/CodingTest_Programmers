import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        // N+1 -> 1번부터 N번 스테이지, 모두 클리어 시 N+1
        // 스테이지 도달한 사람 -> 0번부터 stages[i]-1번까지++
        // ex) stages[i] = 3이면 0, 1, 2 모두 ++
        int[] current = new int[N+1];
        // 스테이지 클리어 못하고 머무르는 사람
        int[] uncleared = new int[N+1];
        
        for(int i = 0; i < stages.length; i++) {
            for(int j = 0; j < stages[i]; j++) {
                current[j]++;
            }
            // ex) stages[i] = 2이면 0부터 시작이니까 1번 인덱스
            uncleared[stages[i]-1]++;
        }
        
        Map<Integer, Double> failedRate = new HashMap<>();
        for(int i = 0; i < N; i++) {
            if(current[i] == 0 || uncleared[i] == 0) {
                failedRate.put(i+1, 0.0);
            } else {
                failedRate.put(i+1, (double)uncleared[i] / (double)current[i]);
            }
        }
        
        List<Integer> keySet = new ArrayList<>(failedRate.keySet());
        
        keySet.sort((o1, o2) -> failedRate.get(o2).compareTo(failedRate.get(o1)));
        
        for(int i = 0; i < N; i++) {
            answer[i] = keySet.get(i);
        }
        
        return answer;
    }
}