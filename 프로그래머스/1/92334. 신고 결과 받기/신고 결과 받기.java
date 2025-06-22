import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Integer> idIdx = new HashMap<>();
        for(int i = 0; i < id_list.length; i++) {
            idIdx.put(id_list[i], i);
        }
        
        // 해당 유저에 대한 신고자 리스트 저장할 map
        Map<String, Set<String>> map = new HashMap<>();
        for(String id : id_list) {
            // 중복 신고 제거
            Set<String> reporter_set = new HashSet<>();
            map.put(id, reporter_set);
        }
        
        for(String r : report) {
            String user_id = r.split(" ")[0];
            String reported_id = r.split(" ")[1];
            map.get(reported_id).add(user_id);
        }
            
        // 신고 당한 수가 k이상인 id들에 대해 신고한 유저들에게 보낼 메일 
        for(String key : map.keySet()) {
            Set<String> reporters = map.get(key);
            if(reporters.size() >= k) {
                for(String reporter : reporters) {
                    answer[idIdx.get(reporter)]++;
                }
            }
        }
        
        return answer;
    }
}