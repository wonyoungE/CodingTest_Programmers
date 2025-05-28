import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] split = s.split("");
        
        Arrays.sort(split, Collections.reverseOrder());
        
        for(String str : split) {
            sb.append(str);
        }
        
        return sb.toString();
    }
}