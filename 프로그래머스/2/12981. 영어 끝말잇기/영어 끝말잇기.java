import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        List<String> wordList = new ArrayList<>();
        wordList.add(words[0]);
        char prev_c = words[0].charAt(words[0].length() - 1);
        
        for(int i = 1; i < words.length; i++) {
            
            char pres_c = words[i].charAt(0);
            
            if(prev_c != pres_c || wordList.contains(words[i])) {
                return new int[] {(i + 1) % n == 0 ? n : (i + 1) % n, i / n + 1};
            } else {
                wordList.add(words[i]);
                prev_c = words[i].charAt(words[i].length() - 1);
            }
        }
        
        return new int[]{0, 0};
    }
}