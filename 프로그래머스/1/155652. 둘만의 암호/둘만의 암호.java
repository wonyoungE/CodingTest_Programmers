import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        List<String> alphabet = new ArrayList<>();
        
        for(int i = 0; i < 26; i++) {
            // skip에 포함된 알파벳이 아니면 배열에 추가
            char c = (char)(i + 97);
            if(!skip.contains(String.valueOf(c))) {
                alphabet.add(String.valueOf(c));
            }
        }
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int cIdx = alphabet.indexOf(String.valueOf(c));
            answer += alphabet.get((cIdx + index) % alphabet.size());
        }
        
        return answer;
    }
}