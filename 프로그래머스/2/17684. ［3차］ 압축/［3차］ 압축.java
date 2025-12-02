import java.util.*;

class Solution {
    public int[] solution(String msg) {
        List<Integer> answer = new ArrayList<>();
        List<String> dic = new ArrayList<>();
        
        // 사전 초기화
        for(int i = 0; i < 26; i++) {
            dic.add(Character.toString('A' + i));
        }
        
        int idx = 0;
        while(idx < msg.length()) {
            String w = "" + msg.charAt(idx++);
            
            // w+c가 사전에 없을 때까지 늘리기
            while(idx < msg.length() && dic.indexOf(w + msg.charAt(idx)) != -1) {
                w += msg.charAt(idx++);
            }
            
            // w는 사전에 존재하는 가장 긴 문자열
            answer.add(dic.indexOf(w) + 1);
            
            // w+c 사전에 등록
            if(idx < msg.length()) {
                dic.add(w + msg.charAt(idx));
            }
        }
        
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}