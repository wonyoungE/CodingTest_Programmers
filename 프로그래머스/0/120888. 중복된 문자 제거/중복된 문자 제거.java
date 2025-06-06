import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] split = my_string.split("");
        
        for(String s : split) {
            if(!answer.contains(s)) {
                answer += s;
            }
        }
        
        return answer;
    }
}