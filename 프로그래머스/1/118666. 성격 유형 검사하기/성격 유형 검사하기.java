import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String[] s = {"R", "T", "C", "F", "J", "M", "A", "N"};
        Map<String, Integer> map = new HashMap<>();
        for(String c : s) {
            map.put(c, 0);
        }
        
        for(int i = 0; i < choices.length; i++) {
            if(choices[i] < 4) {
                String type = survey[i].charAt(0) + "";
                map.put(type, map.get(type) + (4 - choices[i]));
            } else if(choices[i] > 4) {
                String type = survey[i].charAt(1) + "";
                map.put(type, map.get(type) + (choices[i] - 4));
            }
        }
        
        answer += map.get("R") >= map.get("T") ? "R" : "T";
        answer += map.get("C") >= map.get("F") ? "C" : "F";
        answer += map.get("J") >= map.get("M") ? "J" : "M";
        answer += map.get("A") >= map.get("N") ? "A" : "N";
        
        return answer;
    }
}