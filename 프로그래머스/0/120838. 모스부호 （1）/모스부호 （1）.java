import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        StringBuilder answer = new StringBuilder();
        String[] split = letter.split(" ");
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < morse.length; i++) {
            map.put(morse[i], i);
        }
        
        for(String s : split) {
            answer.append((char)(map.get(s) + 'a'));
        }
        
        return answer.toString();
    }
}