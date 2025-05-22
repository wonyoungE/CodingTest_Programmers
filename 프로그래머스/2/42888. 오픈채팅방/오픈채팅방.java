import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] record) {
        // 유저 id와 user 닉네임을 저장하는 hashMap 필요
        HashMap<String, String> nickname = new HashMap<>();
        int answer_len = 0;
        
        for(String str : record) {
            String[] split = str.split(" ");
            if(str.startsWith("Enter")) {
                nickname.put(split[1], split[2]);
                answer_len++;
            } else if(str.startsWith("Change")) {
                // hashMap의 value값 변경
                nickname.replace(split[1], split[2]);
            } else {
                answer_len++;
            }
        }
        
        String[] answer = new String[answer_len];
        int answer_idx = 0;
        
        for(String str : record) {
            String[] split = str.split(" ");
            if(str.startsWith("Enter")) {
                answer[answer_idx++] = nickname.get(split[1]) + "님이 들어왔습니다.";
            } else if(str.startsWith("Leave")) {
                answer[answer_idx++] = nickname.get(split[1]) + "님이 나갔습니다.";
            }
        }
        
        return answer;
    }
}