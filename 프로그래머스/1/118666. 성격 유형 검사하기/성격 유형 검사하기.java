import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> type = new HashMap<>();
        
        for(char c : "RTCFJMAN".toCharArray()) {
            type.put(c, 0);
        }
        
        for(int i = 0; i < choices.length; i++) {
            if(choices[i] < 4) {
                char t = survey[i].charAt(0);
                type.put(t, type.get(t) + (4 - choices[i]));
            } else if (choices[i] > 4) {
                char t = survey[i].charAt(1);
                type.put(t, type.get(t) + (choices[i] - 4));
            }
        }
        
        sb.append(type.get('R') >= type.get('T') ? "R" : "T");
        sb.append(type.get('C') >= type.get('F') ? "C" : "F");
        sb.append(type.get('J') >= type.get('M') ? "J" : "M");
        sb.append(type.get('A') >= type.get('N') ? "A" : "N");
        
        return sb.toString();
    }
}